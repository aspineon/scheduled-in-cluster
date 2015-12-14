package voters.scheduler;

public interface RegisteredSchedulerService {

    boolean ifNoMasterSchedulerRegisterThisScheduler(String schedulerName);

    boolean ifThisSchedulerIsRegisteredAsMasterIncreaseHeartbeat(String schedulerName);
}
