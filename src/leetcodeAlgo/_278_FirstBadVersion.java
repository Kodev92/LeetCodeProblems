package leetcodeAlgo;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
class VersionControl {
    boolean isBadVersion(int version){
        if (version < 17)
            return true;
        else
            return false;
    };
}


class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {

        int firstVersion = 1;
        int lastVersion = n;
        int oldestBadVersionMaybe = 0;

        while (firstVersion <= lastVersion) {
            oldestBadVersionMaybe = firstVersion + (lastVersion - firstVersion) / 2;
            if (isBadVersion(oldestBadVersionMaybe)) {
                lastVersion = oldestBadVersionMaybe - 1;
            } else {
                firstVersion = oldestBadVersionMaybe + 1;
            }
        }
        return oldestBadVersionMaybe;

    }
}
