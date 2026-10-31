class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int left, int right) {

        int i = 1;
        ListNode* curr = head;
        ListNode* pre = NULL;

        while(curr != NULL)
        {
            if(i == left)
            {
                ListNode* Next = NULL;
                ListNode* reverseHead = curr;
                ListNode* Pre = NULL;

                while(i <= right)
                {
                    Next = curr->next;
                    curr->next = Pre;
                    Pre = curr;
                    curr = Next;
                    i++;
                }

                if(pre != NULL)
                    pre->next = Pre;
                else
                    head = Pre;

                reverseHead->next = curr;

                return head;
            }

            pre = curr;
            curr = curr->next;
            i++;
        }

        return head;
    }
};