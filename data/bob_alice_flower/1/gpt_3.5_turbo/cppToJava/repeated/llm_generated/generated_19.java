class Solution {
    public long flowerGame(long n, long m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner parser = new Scanner(line);
            long n = parser.nextLong();
            long m = parser.nextLong();
            parser.close();

            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}