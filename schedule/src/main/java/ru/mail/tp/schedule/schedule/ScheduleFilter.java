package ru.mail.tp.schedule.schedule;

import java.io.Serializable;

/**
 * author: grigory51
 * date: 27/09/14
 */
public class ScheduleFilter implements Serializable {
    private final int subgroupId;
    private final int disciplineId;
    private final int lessonTypeId;
    private final boolean showPassed;

    public ScheduleFilter() {
        this(0, 0, 0, false);
    }

    public ScheduleFilter(int subgroupId, int disciplineId, int lessonTypeId, boolean showPassed) {
        this.subgroupId = subgroupId;
        this.disciplineId = disciplineId;
        this.lessonTypeId = lessonTypeId;
        this.showPassed = showPassed;
    }

    public int getSubgroupId() {
        return this.subgroupId;
    }

    public int getDisciplineId() {
        return this.disciplineId;
    }

    public int getLessonTypeId() {
        return this.lessonTypeId;
    }

    public boolean getShowPassed() {
        return this.showPassed;
    }
}
