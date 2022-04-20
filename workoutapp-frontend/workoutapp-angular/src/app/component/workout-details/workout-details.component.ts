import { Component, OnInit } from '@angular/core';
import { WeightliftingMovementsService } from 'src/app/services/weightlifting-movements.service';
import { WeightliftingMovements } from 'src/app/common/weightlifting-movements';
import { WorkoutDetails } from 'src/app/common/workout-details';
import { WorkoutDetailsService } from 'src/app/services/workout-details.service';

@Component({
  selector: 'app-workout-details',
  templateUrl: './workout-details.component.html',
  styleUrls: ['./workout-details.component.css']
})
export class WorkoutDetailsComponent implements OnInit {

  weightliftingMovements: WeightliftingMovements[]
  workoutDetails: WorkoutDetails[];
  constructor(private workoutDetailsService: WorkoutDetailsService, private weightliftingMovementsService: WeightliftingMovementsService) { }

  ngOnInit(): void {

    this.listWorkoutDetails();
    this.getWeightliftingDetails();

  }

  listWorkoutDetails() {
    this.workoutDetailsService.getWorkoutDetails().subscribe(
      data => {
        this.workoutDetails = data;
      }
    )
    }
  getWeightliftingDetails() {
    this.weightliftingMovementsService.getWeightliftingMovements().subscribe(
      data => {
        this.weightliftingMovements = data;
      }
    )
  }


}
