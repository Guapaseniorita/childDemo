import headСircumference.HeadCircCheck
import headСircumference.girl.GirlHeadCircStrategy
import weight.WeightCheck
import weight.boy.BoyWeightStrategy
import weight.girl.GirlWeightStrategy
import java.time.LocalDate
import java.time.temporal.ChronoUnit


fun main(args: Array<String>) {
    val input: Input = Input(20, 6, 2023, 2.3, false, 31.0)
    val ageInDays = AgeInDays().calculateAge(input.day, input.month, input.year)
    val weightCheckBoy = WeightCheck(BoyWeightStrategy())
    val weightCheckGirl = WeightCheck(GirlWeightStrategy())
    val headCircGirl = HeadCircCheck(GirlHeadCircStrategy())
    if (input.boy == true) {
        println(weightCheckBoy.checkWeight(input.weight, ageInDays))
    } else {
        println(weightCheckGirl.checkWeight(input.weight, ageInDays))
        println(headCircGirl.checkHeadCirc(input.headCirc, ageInDays))
    }
}