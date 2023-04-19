from Prisoner import Prisoner

class LoPrimeroQueSeMeOcurrio(Prisoner):
    def __init__(self):
        self.times_betrayed = 1
    
    def pick_strategy(self):
        return False if self.times_betrayed > 0 else True
    
    def process_results(self, my_strategy, other_strategy):
        if other_strategy == False:
            self.times_betrayed += 1
        else:
            self.times_betrayed -= 1
            if self.times_betrayed < 0:
                self.times_betrayed = 0
