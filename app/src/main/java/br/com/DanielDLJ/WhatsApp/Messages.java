package br.com.DanielDLJ.WhatsApp;


public class Messages {
    private String from, message, type, to, messageID, time, date;
    private String uidUser,nameUser;

    public Messages() {
    }

    public Messages(String from, String message, String type, String to, String messageID, String time, String date) {
        this.from = from;
        this.message = message;
        this.type = type;
        this.to = to;
        this.messageID = messageID;
        this.time = time;
        this.date = date;
    }

    public Messages(String from, String message, String type, String to, String messageID, String time, String date, String uidUser, String nameUser) {
        this.from = from;
        this.message = message;
        this.type = type;
        this.to = to;
        this.messageID = messageID;
        this.time = time;
        this.date = date;
        this.uidUser = uidUser;
        this.nameUser = nameUser;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUidUser() { return uidUser; }

    public void setUidUser(String uidUser) { this.uidUser = uidUser; }

    public String getNameUser() { return nameUser; }

    public void setNameUser(String nameUser) { this.nameUser = nameUser; }
}

