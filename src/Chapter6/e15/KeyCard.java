package Chapter6.e15;

sealed interface KeyCard permits EmployeeCard, GuestCard{
    SecurityLevel getLevel();
}
