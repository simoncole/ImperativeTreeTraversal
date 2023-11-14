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
inputTree = t1


#visit when there are no unvisited children
#iterate through children to see
#once visited pop from stack
#go to first unvisited child
def DepthFirst(tree):
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
            val = stack.pop()["val"]
            print(val)
            visited.add(val)


DepthFirst(t1)