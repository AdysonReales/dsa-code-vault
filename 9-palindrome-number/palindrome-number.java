class Solution {
    public boolean isPalindrome(int x) {
    int result = 0;
    int original = x;
	while(x > 0)
	{   
		int lastdigit = x % 10;
		x = x / 10;
        result = (result*10) + lastdigit;
	}
    if(result == original)
    {
        return true;
    }
    else{
        return false;
    }
    }
}

