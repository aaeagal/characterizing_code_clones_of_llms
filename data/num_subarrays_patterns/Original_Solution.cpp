char sign(int i) {
    return i > 0 ? '+' : i < 0 ? '-' : '0';
}

int countMatchingSubarrays(vector<int>& nums, vector<int>& pattern) {
    string s, p;
    for (int i = 1; i < nums.size(); i++)
        s += sign(nums[i] - nums[i - 1]);
    for (int i : pattern)
        p += sign(i);
    return kmp_search(s, p, kmp_table(p)).size();
}