package cn.zealon.pac;

import java.util.Date;

/**
 * 任务
 * @auther: Zealon
 * @Date: 2018-06-29 10:48
 */
public class Task {

    private String id;
    private String jsonData;
    private int state;
    private Date createTime;
    private Date finishTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", jsonData='" + jsonData + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
