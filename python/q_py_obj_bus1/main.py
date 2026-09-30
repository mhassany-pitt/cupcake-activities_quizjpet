class Bus:
    def __init__(self, capacity):
        self.capacity = capacity
        self.passengers = 0
    def take_passengers(self, count):
        added = min(count, self.capacity - self.passengers)
        self.passengers = self.passengers + added
        return added
    def leave_passengers(self, count):
        if self.passengers < count:
          return False
        self.passengers = self.passengers - count
        return True
    def get_passenger_count(self):
        return self.passengers
    def is_bigger_than(self, other):
        return self.capacity > other.capacity
    def has_more_passengers(self, other):
        return self.passengers > other.passengers
def main():
    bus1 = Bus(42)
    bus2 = Bus(25)
    print(bus1.is_bigger_than(bus2))
    added = bus1.take_passengers(30)
    print(added)
    print(bus1.get_passenger_count())
    bus2.leave_passengers(10)
    print(bus1.has_more_passengers(bus2))
main()