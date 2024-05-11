
class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> list = new ArrayList<Long>();
        long l = n;
        list.add(l);

        while (l != 1) {
            if ((l & 1) == 0) {
                l = (long) Math.floor(Math.pow(l, 0.5));
            } else {
                l = (long) Math.floor(Math.pow(l, 1.5));
            }

            list.add(l);
        }

        return list;
    }
}