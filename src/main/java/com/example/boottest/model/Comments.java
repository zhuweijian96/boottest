package com.example.boottest.model;

public class Comments {
    String tid;
    String pid;
    String fid;
    String author;
    String autherid;
    String subject;
    String dateline;
    String status;
    String message;
    String parent_pid;
    String [] image_list;
    String authorHeadImage;
    String likeNum;
    Object [] replays;
    Comment [] comment;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAutherid() {
        return autherid;
    }

    public void setAutherid(String autherid) {
        this.autherid = autherid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParent_pid() {
        return parent_pid;
    }

    public void setParent_pid(String parent_pid) {
        this.parent_pid = parent_pid;
    }

    public String[] getImage_list() {
        return image_list;
    }

    public void setImage_list(String[] image_list) {
        this.image_list = image_list;
    }

    public String getAuthorHeadImage() {
        return authorHeadImage;
    }

    public void setAuthorHeadImage(String authorHeadImage) {
        this.authorHeadImage = authorHeadImage;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public Object[] getReplays() {
        return replays;
    }

    public void setReplays(Object[] replays) {
        this.replays = replays;
    }

    public Comment[] getComment() {
        return comment;
    }

    public void setComment(Comment[] comment) {
        this.comment = comment;
    }
}
