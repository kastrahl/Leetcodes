#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};                      //no problems

void printList(struct Node* n){
    while (n != NULL) {
        printf(" %d ", n->data);
        n = n->next;
    }
    printf("\n");
}     //no problems

void insert_given_node(struct Node* l1, int afterdata, int datatoinsert) 
{
    struct Node *ptr, *cpt;
    int data;
    ptr = (struct Node*)malloc(sizeof(struct Node));
    if (ptr == NULL) 
    {
        printf ("overflow\n");
        return;
    }
    
    ptr->data = datatoinsert;
    
    cpt = l1;
    while (cpt -> data != afterdata)
    cpt = cpt -> next;
    ptr -> next = cpt -> next;
    cpt -> next = ptr;
}

struct Node* mergeTwoLists(struct Node* l1, struct Node* l2)
{
    if(l1 == NULL&&l2 == NULL)
    {
        return l1;
    }
    
    int data;
    struct Node *t1,*t2,*ptr,*start=l1;                       //t1= l1's next node , t2= l2's current position's data
    printList(start);
    
    ptr=(struct Node*)malloc(sizeof(struct Node));
    
    while(l1!=NULL)
    {
        if(l1->next!=NULL)                          //check if not last node in l1
            {
                t1=l1->next;                        //store L1'S NEXT NODE in t1 to compare with l2's current node
                if(t1->data <= l2->data)            //if l1's next node's data is less or equal to l2's current node
                {
                    l1=l1->next;                    //proceed to next l1's next node ( the node in l1 is less than l2)
                }
                else
                {
                    insert_given_node(l1,l1->data,l2->data);
                    l1=l1->next;
                    l2=l2->next;
                }
            }
        else
            {
                l1->next=l2;
                l1=l1->next;
                break;
            }
    }
    printList(start);
    return start;
}

int main()  //no problems
{
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;
    
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    
    head->data = 1; 
    head->next = second;
    
    second->data = 2; 
    second->next = third;
    
    third->data = 3; 
    third->next = NULL;
    
    printList(head);
    
    struct Node* h = NULL;
    struct Node* s = NULL;
    struct Node* t = NULL;
    
    h = (struct Node*)malloc(sizeof(struct Node));
    s = (struct Node*)malloc(sizeof(struct Node));
    t = (struct Node*)malloc(sizeof(struct Node));
    
    h->data = 1; 
    h->next = s;
    
    s->data = 2; 
    s->next = t;
    
    t->data = 4; 
    t->next = NULL;
    
    printList(h);
    
    mergeTwoLists(head,h);

}
