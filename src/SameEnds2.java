public class SameEnds2 {
  public boolean sameEnds(int[] nums, int len) {
    boolean result = true;

    for (int i = 0; i < len; i++) {
      if (nums[i] == nums[nums.length - len + i]) {
        result = true;
      } else {
        result = false;
      }
    }
    return result;
  }
}
