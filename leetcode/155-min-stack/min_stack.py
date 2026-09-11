# LC 155 - Min Stack

class MinStack:

    def __init__(self):
        self.data = []
        self.minimum = []

    def push(self, val: int) -> None:
        self.data.append(val)
        value = min(val, self.minimum[-1] if self.minimum else val)
        self.minimum.append(value)
        

    def pop(self) -> None:
        self.data.pop();
        self.minimum.pop();

    def top(self) -> int:
        return self.data[-1]

    def getMin(self) -> int:
        return self.minimum[-1]

