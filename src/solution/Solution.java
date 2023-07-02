package solution;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private static Object Arrays;
    int answer = 2147483647;
    int[] row = {0, 0, -1, 1};
    int[] col = {-1, 1, 0, 0};

    public int solution(int[] nums) {
        int answer = 0;

        int halfNumsLen = nums.length/2;

        Set<Integer> ponKetMonSet = new HashSet<>();
        for (Integer num : nums) {
            ponKetMonSet.add(num);
        }

        System.out.println(ponKetMonSet);

        if (ponKetMonSet.size() > halfNumsLen) {
            answer = halfNumsLen;
        } else {
            answer = ponKetMonSet.size();
        }

        return answer;
    }


    private void recur(int curR, int curC, int cnt, int n, int m, boolean[][] visited, int[][] maps) {
        if (curR == n - 1 && curC == m - 1) {
            if (answer > cnt) {
                answer = cnt;
            }
        } else {
            for (int i = 0; i < 4; ++i) {
                int nextR = curR + row[i];
                int nextC = curC + col[i];

                if ((nextR >= 0 && nextR < n) && (nextC >= 0 && nextC < m)) {
                    if (maps[nextR][nextC] == 1) {
                        if (visited[nextR][nextC] != true) {
                            visited[nextR][nextC] = true;
                            recur(nextR, nextC, cnt + 1, n, m, visited, maps);
                            visited[nextR][nextC] = false;
                        }

                    }

                }

            }

        }

    }


    public static void main(String[] args) {
        /**
         * [[1,0,1,1,1],
         * [1,0,1,0,1],
         * [1,0,1,1,1],
         * [1,1,1,0,1],
         * [0,0,0,0,1]]
         *
         *
         * •	당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에
         * 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
         * 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
         * 예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리,
         * 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
         * 1.	첫 번째(3번), 두 번째(1번) 폰켓몬을 선택
         * 2.	첫 번째(3번), 세 번째(2번) 폰켓몬을 선택
         * 3.	첫 번째(3번), 네 번째(3번) 폰켓몬을 선택
         * 4.	두 번째(1번), 세 번째(2번) 폰켓몬을 선택
         * 5.	두 번째(1번), 네 번째(3번) 폰켓몬을 선택
         * 6.	세 번째(2번), 네 번째(3번) 폰켓몬을 선택
         *
         *
         * 이때, 첫 번째(3번) 폰켓몬과 네 번째(3번) 폰켓몬을 선택하는 방법은 한 종류(3번 폰켓몬 두 마리)의 폰켓몬만 가질 수 있지만,
         * 다른 방법들은 모두 두 종류의 폰켓몬을 가질 수 있습니다. 따라서 위 예시에서 가질 수 있는 폰켓몬 종류 수의 최댓값은 2가 됩니다.
         * 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
         * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을
         * 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
         * 제한사항
         * •	nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
         * •	nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
         * •	폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
         * •	가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
         * ________________________________________
         * 입출력 예
         * nums	result
         * [3,1,2,3]	2
         * [3,3,3,2,2,4]	3
         * [3,3,3,2,2,2]	2
         * 입출력 예 설명
         * 입출력 예 #1
         * 문제의 예시와 같습니다.
         * 입출력 예 #2
         * 6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
         * 가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리, 2번 폰켓몬 한 마리, 4번 폰켓몬 한 마리를 고르면 되며, 따라서 3을 return 합니다.
         * 입출력 예 #3
         * 6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
         * 가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리와 2번 폰켓몬 두 마리를 고르거나, 혹은 3번 폰켓몬 두 마리와 2번 폰켓몬 한 마리를 고르면 됩니다. 따라서 최대 고를 수 있는 폰켓몬 종류의 수는 2입니다.
         */

        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Solution s = new Solution();

        int[] array1 = {3, 1, 2, 3};
//        List<Integer> list1 = Arrays.asList(array1);

        int[] array2 = {3, 3, 3, 2, 2, 4};
//        List<Integer> list2 = Arrays.asList(array2);

        int[] array3 = {3, 3, 3, 2, 2, 2};
//        List<Integer> list3 = Arrays.asList(array3);

//        System.out.println("List 1: " + list1);
//        System.out.println("List 2: " + list2);
//        System.out.println("List 3: " + list3);

        System.out.println(s.solution(array1));
    }

}
