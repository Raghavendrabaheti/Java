// #include<iostream>
// using namespace std;

// int main(){
//     int arr1[] = {10,20,30,80};
//     int arr2[] = {2,25,36,75};

//     int merge[20];

//     int i=0,j=0,k=0;

//     while (i<4 && j<4)
//     {
//         if (arr1[i] < arr2[j])
//         {
//             merge[k] = arr1[i];
//             i++,k++;
//         }

//         else{
//             merge[k] = arr2[j];
//             j++,k++;
//         }
//     }

//     while (i<4)
//     {
//         merge[k] = arr1[i];
//         i++,k++;
//     }

//     while (j<4)
//     {
//         merge[k] = arr1[j];
//         j++,k++;
//     }

//     for (int x=0;x<k;x++)
//     {
//         cout <<merge[x]<<" ";
//     }
//     return 0;
// }


#include<stdio.h>
#include<stdlib.h> //DMA

typedef struct linknode{
    int data;
    struct linknode *next;
}node;


node *head,*ptr,*temp,*last;

void create_node(){
    temp=(node*)malloc(sizeof(node));
    printf("Enter element \n");
    scanf("%d",&temp->data);
    temp->next=NULL;
}
node *reverselinkedlist(node *head){
    node *prev=NULL;
    node *temp2=NULL;

    while(head!=NULL){
        temp2=head->next;
        head->next=prev;
        prev=head;
        head=temp2;
    }

    head=prev;
}
int main(){
    int ch;
    printf("Enter how many nodes u anna create\n");
    scanf("%d",&ch);
    for(int i=0;i<ch;i++){
    create_node();
    if(head==NULL){
        head=temp;
        last=temp;
    }
    else {
        last->next=temp;
        last=temp;
    }
    }
    head = reverselinkedlist(head);

    ptr=head;
    while(ptr!=NULL){
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }

    return 0;
}