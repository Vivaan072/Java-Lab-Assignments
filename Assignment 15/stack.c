#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int id;
    char url[100];
    struct Node *next;
};

struct Node *top = NULL;
int count = 0;

void push()
{
    struct Node *newNode;

    newNode = (struct Node *)malloc(sizeof(struct Node));

    if (newNode == NULL)
    {
        printf("Memory allocation failed.\n");
        return;
    }

    printf("Enter Page ID: ");
    scanf("%d", &newNode->id);

    printf("Enter Page Name/URL: ");
    scanf(" %[^\n]", newNode->url);

    newNode->next = top;
    top = newNode;
    count++;

    printf("Webpage visited successfully.\n");
}

void pop()
{
    struct Node *temp;

    if (top == NULL)
    {
        printf("Browser history is empty.\n");
        return;
    }

    temp = top;

    printf("Going back from: %s\n", top->url);

    top = top->next;
    free(temp);
    count--;
}

void peek()
{
    if (top == NULL)
        printf("Browser history is empty.\n");
    else
        printf("Current Page: %d - %s\n", top->id, top->url);
}

void display()
{
    struct Node *temp = top;

    if (top == NULL)
    {
        printf("Browser history is empty.\n");
        return;
    }

    printf("\n--- Browser History ---\n");

    while (temp != NULL)
    {
        printf("%d - %s\n", temp->id, temp->url);
        temp = temp->next;
    }
}

void isEmpty()
{
    if (top == NULL)
        printf("Browser history is empty.\n");
    else
        printf("Browser history is not empty.\n");
}

void size()
{
    printf("Total webpages: %d\n", count);
}

int main()
{
    int choice;
    char input[20];

    do
    {
        printf("\n--- BROWSER HISTORY MENU ---\n");
        printf("1. Visit Webpage (Push)\n");
        printf("2. Back (Pop)\n");
        printf("3. Current Page (Peek)\n");
        printf("4. Display History\n");
        printf("5. Check Empty\n");
        printf("6. Size\n");
        printf("7. Exit\n");

        printf("Enter choice: ");

        fgets(input, sizeof(input), stdin);
        choice = atoi(input);

        switch (choice)
        {
            case 1:
                push();
                break;

            case 2:
                pop();
                break;

            case 3:
                peek();
                break;

            case 4:
                display();
                break;

            case 5:
                isEmpty();
                break;

            case 6:
                size();
                break;

            case 7:
                printf("Exiting program...\n");
                break;

            default:
                printf("Invalid choice! Enter 1 to 7.\n");
        }

        /* Clear newline left by scanf in push */
        if (choice == 1)
        {
            while (getchar() != '\n');
        }

    } while (choice != 7);

    return 0;
}