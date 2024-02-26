int f(int n, int p) // function to calculate (ai power bi % 10)
{
    int i = 0;
    int res = 1;

    while (i < p)
    {
        res *= n;
        res %= 10;
        ++i;
    }

    return res;
}

int s(int n, int p, int m)  // function to calculate ((ai power bi % 10) power ci) % mi
{ 
    int i = 0;
    int res = 1;

    while (i < p)
    {
        res *= n;
        res %= m;
        ++i;
    }

    return res;
}

class Solution
{
public:
    vector<int> getGoodIndices(vector<vector<int>> &v, int target)
    {

        int first, sec;

        vector<int> res;
        vector<int> t;

        int a, b, c, m;

        for (int i = 0; i < v.size(); ++i)
        {
            t = v[i];
            a = t[0];
            b = t[1];
            c = t[2];
            m = t[3];

            first = f(a, b);

            sec = s(first, c, m);

            if (sec == target)
                res.push_back(i);
        }

        return res;
    }
};