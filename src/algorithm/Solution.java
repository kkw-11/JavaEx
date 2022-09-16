package algorithm;

class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        Solution.dfs(numbers, target, 0, 0);
        return answer;
    }
    public static void dfs(int[] numbers, int target, int depth, int total){
        if(depth == numbers.length){
            if(total == target){
                Solution.answer += 1;
            }
            return;
        }

        dfs(numbers, target, depth + 1, total + numbers[depth]);
        dfs(numbers, target, depth + 1, total - numbers[depth]);

    }
}