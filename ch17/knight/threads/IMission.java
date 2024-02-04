package gr.aueb.cf.ch17.knight.threads;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus status);
    void embark();
}
