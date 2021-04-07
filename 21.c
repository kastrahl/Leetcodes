/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


void append(struct ListNode** head_ref, int new_data)
{
    struct ListNode *new_node = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode *last = *head_ref;
    new_node->val  = new_data;
    new_node->next = NULL;
    if (*head_ref == NULL)
    {
       *head_ref = new_node;
       return;
    }      
    while (last->next != NULL)
        last = last->next;
    last->next = new_node;
    return;    
}

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2)
{
    
    if(l1 == NULL&&l2 != NULL)
    {
        return l2;
    }
    else
    if(l1 != NULL&&l2 == NULL)
    {
        return l1;
    }
    else
    if(l1 == NULL&&l2 == NULL)
    {
        return l1;
    }
    
    if(l1->val > l2->val)
    {
        struct ListNode *temp;
        temp=l1;
        l1=l2;
        l2=temp;
    }
    int data;
    struct ListNode *start=l1;                       //t1= l1's next node , t2= l2's current position's data
    struct ListNode *t1= NULL; 
    
    while(l1!=NULL||l2!=NULL)
    {
        if(l1==NULL)
        {
            while(l2!=NULL)
            {
                append(&t1,l2->val);
                l2=l2->next;
            }
        }
        else 
        if(l2==NULL)
        {
            while(l1!=NULL)
            {
                append(&t1,l1->val);
                l1=l1->next;
            }
        }
        
        if(l1!=NULL && l1->val <= l2->val)
        {
            data = l1->val;
            append(&t1,l1->val);
            l1=l1->next;
        }
        else
        if(l2!=NULL && l1->val > l2->val )
        {
            data=l2->val;
            append(&t1,l2->val);
            l2=l2->next;
        }
    }
    return t1;
}
