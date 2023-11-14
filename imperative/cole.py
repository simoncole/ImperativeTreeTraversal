t1 = {
    'val': 1,
    'children': [
        {
            'val': 2,
            'children': [
                {
                    'val': 5,
                    'children': [
                        {
                            'val': 11,
                            'children': []
                        },
                        {
                            'val': 12,
                            'children': [
                                {
                                    'val': 17,
                                    'children': []
                                }
                            ]
                        }
                    ]
                },
                {
                    'val': 6,
                    'children': [
                        
                    ]
                }
            ]
        },
        {
            'val': 3,
            'children': [
                {
                    'val': 7,
                    'children': []
                },
                {
                    'val': 8,
                    'children': []
                }
            ]
        },
        {
            'val': 4,
            'children': [
                {
                    'val': 9,
                    'children': [
                        {
                            'val': 13,
                            'children': []
                        },
                        {
                            'val': 14,
                            'children': []
                        }
                    ]
                },
                {
                    'val': 10,
                    'children': [
                        {
                            'val': 15,
                            'children': []
                        },
                        {
                            'val': 16,
                            'children': []
                        }
                    ]
                }
            ]
        }
    ]
}
emptyTree = {}
inputTree = t1


#visit when there are no unvisited children
#iterate through children to see
#once visited pop from stack
#go to first unvisited child
def DepthFirst(tree):
    print("Traversing Depth First Post-Order")
    sequeunce = []
    if tree:
        visited = set()
        stack = [tree]
        while(stack):
            #add to the stack the first unvisited child
            unVisited = False
            stackTop = stack[-1]
            for child in stackTop["children"]:
                if child["val"] not in visited:
                    stack.append(child)
                    unVisited = True
                    break
            #if there were no unvisited children, visit, pop
            if not unVisited:
                sequeunce.append(stack[-1]["val"])
                val = stack.pop()["val"]
                print(val)
                visited.add(val)
    return sequeunce

def BreadthFirst(tree):
    print("Traversing Breadth First")
    sequence = []
    if tree:
        visited = set()
        queue = [tree]
        while queue:
            #visit and remove
            sequence.append(queue[0]["val"])
            print(queue[0]["val"])
            visited.add(queue[0]["val"])
            #add children to queue
            for child in queue[0]["children"]: queue.append(child)
            queue.pop(0)
    return sequence


DFSequence = DepthFirst(inputTree)
BFSequence = BFSequence = BreadthFirst(inputTree)

print(DFSequence)
print(BFSequence)