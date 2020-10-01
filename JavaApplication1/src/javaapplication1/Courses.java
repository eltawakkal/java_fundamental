/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hayaqo
 */
public class Courses {
    
    private String courseName;
    private String courseOverView;
    private String courseImageUrl;
    private String courseVideoUrl;

    public Courses() {
    }

    public Courses(String courseName, String courseOverView, String courseImageUrl, String courseVideoUrl) {
        this.courseName = courseName;
        this.courseOverView = courseOverView;
        this.courseImageUrl = courseImageUrl;
        this.courseVideoUrl = courseVideoUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseOverView() {
        return courseOverView;
    }

    public void setCourseOverView(String courseOverView) {
        this.courseOverView = courseOverView;
    }

    public String getCourseImageUrl() {
        return courseImageUrl;
    }

    public void setCourseImageUrl(String courseImageUrl) {
        this.courseImageUrl = courseImageUrl;
    }

    public String getCourseVideoUrl() {
        return courseVideoUrl;
    }

    public void setCourseVideoUrl(String courseVideoUrl) {
        this.courseVideoUrl = courseVideoUrl;
    }
    
    
}
