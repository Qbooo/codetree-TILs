const readline = require('readline');

// 입력을 처리하기 위한 인터페이스 생성
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 입력 저장을 위한 배열
let input = [];

// 한 줄씩 입력을 배열에 저장
rl.on('line', (line) => {
    input.push(line);
}).on('close', () => {
    // 첫 번째 줄에서 N과 M을 파싱
    const [N, M] = input[0].split(' ').map(Number);
    
    // 두 번째 줄부터는 간선 정보 파싱
    const edges = input.slice(1).map(line => line.split(' ').map(Number));
    
    // 함수에 N, M, edges를 전달하여 실행
    console.log(countReachableNodes(N, M, edges));
    
    process.exit();
});

// 그래프에서 도달할 수 있는 서로 다른 정점의 수를 계산하는 함수
function countReachableNodes(N, M, edges) {
    // 1. 그래프를 인접 리스트로 표현
    const graph = Array.from({ length: N + 1 }, () => []);
    
    // 2. 간선 정보를 통해 그래프를 구축
    edges.forEach(([x, y]) => {
        graph[x].push(y);
        graph[y].push(x);
    });
    
    // 3. 방문 여부를 기록할 배열
    const visited = Array(N + 1).fill(false);
    
    // 4. DFS 탐색 함수 정의
    function dfs(node) {
        visited[node] = true;
        for (let neighbor of graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
    
    // 5. 1번 정점에서 DFS 시작
    dfs(1);
    
    // 6. 1번 정점을 제외한 방문한 정점의 개수를 카운트
    let count = 0;
    for (let i = 2; i <= N; i++) {
        if (visited[i]) {
            count++;
        }
    }
    
    return count;
}
