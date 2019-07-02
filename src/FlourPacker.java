public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(2, 1, 12));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-1, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int totalCount = ((bigCount * 5) + smallCount);
        if (totalCount < goal) {
            return false;
        }
        int totalBigCount = 0;
        if ((bigCount > 0) && (goal / 5 >= 1)) {
            totalBigCount = (goal / 5);
        }
        if (((totalBigCount * 5) + smallCount) >= goal) {
            return true;
        }
        return false;
    }
}
