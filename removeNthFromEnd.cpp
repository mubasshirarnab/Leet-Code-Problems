struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution
{
public:
    ListNode *removeNthFromEnd(ListNode *head, int n)
    {
        ListNode *p;
        int count = 0;
        p = head;

        while (p != nullptr)
        {
            count++;
            p = p->next;
        }

        if (n == 1 && count == 1)
        {
            delete head;
            return nullptr;
        }
        else if ((count - n) == 0)
        {
            ListNode *q;
            q = head;
            head = head->next;

            delete q;

            return head;
        }
        else if (n == 1)
        {
            ListNode *q;
            q = head;
            ListNode *r;

            while (q->next->next != nullptr)
            {
                q = q->next;
            }

            r = q->next;
            q->next = nullptr;

            delete r;

            return head;
        }
        else
        {
            int x = count - n;
            ListNode *q;
            q = head;
            ListNode *r;

            for (int i = 1; i < x; i++)
            {
                q = q->next;
            }

            r = q->next;
            q->next = r->next;
            delete r;

            return head;
        }
    }
};