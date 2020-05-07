package may_challenge;

import arrays.MajorityElement;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Day 1  could not be tested
		
		// Day 2
		JewelsAndStones jewelsAndStones = new JewelsAndStones();
		System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAABBBBBB"));
		
		// Day 3
		RansomNote ransomNote = new RansomNote();
		System.out.println(ransomNote.canConstruct("aa","abb"));
		
		// Day 4
		NumberComplement numberComplement = new NumberComplement();
		System.out.println(numberComplement.findComplement(5));
		
		// Day 5
		FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
		System.out.println(firstUniqueCharacter.firstUniqChar("leetcode"));
		
		// Day 6
		MajorityElement majorityElement = new MajorityElement();
		System.out.println(majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
		
		CousinsOfBT CousinsOfBT = new CousinsOfBT();
	}
}
