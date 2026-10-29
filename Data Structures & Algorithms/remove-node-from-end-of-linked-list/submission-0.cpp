
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        ListNode* curr = head;
        int cnt = 1;

        while (cnt <= n - 1) {
            cnt++;
            curr = curr->next;
        }

        ListNode* curr1 = head;
        ListNode* pre = NULL;

        while (curr->next != NULL) {
            pre = curr1;
            curr1 = curr1->next;
            curr = curr->next;
        }

        if (pre != NULL) {
            pre->next = curr1->next;
        } else {
            head = curr1->next;
        }

        delete curr1;

        return head;
    }
};
