package bean;

import java.util.List;

/**
 * Created by Hao on 2017/11/9.
 */

public class HomeModel {

    /**
     * code : 0
     * msg :
     * data : [{"id":1,"unionid":null,"xcx_openid":null,"gzh_openid":null,"wx_nickname":"systems","created_at":"2017-08-25 15:11:00","deleted_at":null,"wx_subscribe":1,"wx_headimgurl":null,"wx_city":null,"wx_province":null,"updated_at":"2017-08-27 00:38:35","lat":"22.704700","lng":"114.225025","location_updated_at":null,"sex":2,"phone":"13714876874","real_name":"黄桂旋","idcard":null,"invitation_code":"888888","rc_token":"+EJYKvMKMmUsqgv6/q4hIMnsy9PyXpQzMmiBT0Gt918EHDGTFt2e9Tkejr/4Vp/0nkgnvQAEdsOgOiDe6ds+0w==","headimgurl":null,"company":"思路飞扬","job":"软件开发","nickname":"bajianx","receive_msg_tip":1,"display_user_name":1,"display_phone":1,"distance":"59.8","hobbies":[{"id":1,"name":"唱歌","created_at":null,"updated_at":null,"pivot":{"user_id":1,"hobby_id":1,"created_at":"2017-08-26 23:37:15","updated_at":null}},{"id":3,"name":"高尔夫","created_at":null,"updated_at":null,"pivot":{"user_id":1,"hobby_id":3,"created_at":"2017-08-26 23:37:18","updated_at":null}}],"resources":[{"id":2,"name":"教育资源","created_at":"2017-08-26 23:51:42","updated_at":null,"pivot":{"user_id":1,"resource_id":2,"created_at":"2017-08-26 23:51:52","updated_at":null}}],"resume":{"id":1,"user_id":1,"headimgurl":"https://wx.qlogo.cn/mmopen/vi_32/9nnnKUylibl9iakAEWl2SbM2po9fs9kpaLouGgEBVXe6Z8gBBdCuePlofiaHuDorQTzgWfLRMjwp2mc01U7aqUHuw/0","user_name":"黄桂旋","sex":1,"highest_education":"本科","work_age":3,"city":"深圳市","phone":"13714876874","email":"313066164@qq.com","created_at":null,"updated_at":null,"education_exprience":[{"id":1,"school":"苏州大学","major":"通信工程","graduated_at":"2011-06","education":"本科","resume_id":1,"created_at":"2017-08-27 14:44:47","updated_at":null}],"work_exprience":[{"id":1,"company":"思路飞扬","job":"软件开发","time_begin":"2017-01","time_end":"2017-02","work_content":"打酱油","resume_id":1,"created_at":null,"updated_at":null},{"id":2,"company":"xxx公司","job":"服务器","time_begin":"2017-03","time_end":"至今","work_content":"呵呵呵","resume_id":1,"created_at":null,"updated_at":null}]}},{"id":3,"unionid":null,"xcx_openid":null,"gzh_openid":null,"wx_nickname":null,"created_at":"2017-08-26 16:48:05","deleted_at":null,"wx_subscribe":1,"wx_headimgurl":null,"wx_city":null,"wx_province":null,"updated_at":"2017-08-26 16:48:05","lat":"22.720368","lng":"114.224357","location_updated_at":null,"sex":0,"phone":"13714875556","real_name":null,"idcard":null,"invitation_code":"938294","rc_token":"1+EJYKvMKMmUsqgv6/q4hIMnsy9PyXpQzMmiBT0Gt918EHDGTFt2e9Tkejr/4Vp/0nkgnvQAEdsOgOiDe6ds+0w==","headimgurl":null,"company":null,"job":null,"nickname":null,"receive_msg_tip":1,"display_user_name":1,"display_phone":1,"distance":"61.54","hobbies":[],"resources":[],"resume":null},{"id":4,"unionid":null,"xcx_openid":null,"gzh_openid":null,"wx_nickname":null,"created_at":"2017-08-26 16:51:28","deleted_at":null,"wx_subscribe":1,"wx_headimgurl":null,"wx_city":null,"wx_province":null,"updated_at":"2017-08-26 16:51:28","lat":"22.710680","lng":"114.260328","location_updated_at":null,"sex":0,"phone":"13714875557","real_name":null,"idcard":null,"invitation_code":"192357","rc_token":"1+EJYKvMKMmUsqgv6/q4hIMnsy9PyXpQzMmiBT0Gt918EHDGTFt2e9Tkejr/4Vp/0nkgnvQAEdsOgOiDe6ds+0w==","headimgurl":null,"company":null,"job":null,"nickname":null,"receive_msg_tip":1,"display_user_name":1,"display_phone":1,"distance":"60.57","hobbies":[],"resources":[],"resume":null}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * unionid : null
         * xcx_openid : null
         * gzh_openid : null
         * wx_nickname : systems
         * created_at : 2017-08-25 15:11:00
         * deleted_at : null
         * wx_subscribe : 1
         * wx_headimgurl : null
         * wx_city : null
         * wx_province : null
         * updated_at : 2017-08-27 00:38:35
         * lat : 22.704700
         * lng : 114.225025
         * location_updated_at : null
         * sex : 2
         * phone : 13714876874
         * real_name : 黄桂旋
         * idcard : null
         * invitation_code : 888888
         * rc_token : +EJYKvMKMmUsqgv6/q4hIMnsy9PyXpQzMmiBT0Gt918EHDGTFt2e9Tkejr/4Vp/0nkgnvQAEdsOgOiDe6ds+0w==
         * headimgurl : null
         * company : 思路飞扬
         * job : 软件开发
         * nickname : bajianx
         * receive_msg_tip : 1
         * display_user_name : 1
         * display_phone : 1
         * distance : 59.8
         * hobbies : [{"id":1,"name":"唱歌","created_at":null,"updated_at":null,"pivot":{"user_id":1,"hobby_id":1,"created_at":"2017-08-26 23:37:15","updated_at":null}},{"id":3,"name":"高尔夫","created_at":null,"updated_at":null,"pivot":{"user_id":1,"hobby_id":3,"created_at":"2017-08-26 23:37:18","updated_at":null}}]
         * resources : [{"id":2,"name":"教育资源","created_at":"2017-08-26 23:51:42","updated_at":null,"pivot":{"user_id":1,"resource_id":2,"created_at":"2017-08-26 23:51:52","updated_at":null}}]
         * resume : {"id":1,"user_id":1,"headimgurl":"https://wx.qlogo.cn/mmopen/vi_32/9nnnKUylibl9iakAEWl2SbM2po9fs9kpaLouGgEBVXe6Z8gBBdCuePlofiaHuDorQTzgWfLRMjwp2mc01U7aqUHuw/0","user_name":"黄桂旋","sex":1,"highest_education":"本科","work_age":3,"city":"深圳市","phone":"13714876874","email":"313066164@qq.com","created_at":null,"updated_at":null,"education_exprience":[{"id":1,"school":"苏州大学","major":"通信工程","graduated_at":"2011-06","education":"本科","resume_id":1,"created_at":"2017-08-27 14:44:47","updated_at":null}],"work_exprience":[{"id":1,"company":"思路飞扬","job":"软件开发","time_begin":"2017-01","time_end":"2017-02","work_content":"打酱油","resume_id":1,"created_at":null,"updated_at":null},{"id":2,"company":"xxx公司","job":"服务器","time_begin":"2017-03","time_end":"至今","work_content":"呵呵呵","resume_id":1,"created_at":null,"updated_at":null}]}
         */

        private int id;
        private Object unionid;
        private Object xcx_openid;
        private Object gzh_openid;
        private String wx_nickname;
        private String created_at;
        private Object deleted_at;
        private int wx_subscribe;
        private Object wx_headimgurl;
        private Object wx_city;
        private Object wx_province;
        private String updated_at;
        private String lat;
        private String lng;
        private Object location_updated_at;
        private int sex;
        private String phone;
        private String real_name;
        private Object idcard;
        private String invitation_code;
        private String rc_token;
        private String headimgurl;
        private String company;
        private String job;
        private String nickname;
        private int receive_msg_tip;
        private int display_user_name;
        private int display_phone;
        private String distance;
        private ResumeBean resume;
        private List<HobbiesBean> hobbies;
        private List<ResourcesBean> resources;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getUnionid() {
            return unionid;
        }

        public void setUnionid(Object unionid) {
            this.unionid = unionid;
        }

        public Object getXcx_openid() {
            return xcx_openid;
        }

        public void setXcx_openid(Object xcx_openid) {
            this.xcx_openid = xcx_openid;
        }

        public Object getGzh_openid() {
            return gzh_openid;
        }

        public void setGzh_openid(Object gzh_openid) {
            this.gzh_openid = gzh_openid;
        }

        public String getWx_nickname() {
            return wx_nickname;
        }

        public void setWx_nickname(String wx_nickname) {
            this.wx_nickname = wx_nickname;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public int getWx_subscribe() {
            return wx_subscribe;
        }

        public void setWx_subscribe(int wx_subscribe) {
            this.wx_subscribe = wx_subscribe;
        }

        public Object getWx_headimgurl() {
            return wx_headimgurl;
        }

        public void setWx_headimgurl(Object wx_headimgurl) {
            this.wx_headimgurl = wx_headimgurl;
        }

        public Object getWx_city() {
            return wx_city;
        }

        public void setWx_city(Object wx_city) {
            this.wx_city = wx_city;
        }

        public Object getWx_province() {
            return wx_province;
        }

        public void setWx_province(Object wx_province) {
            this.wx_province = wx_province;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public Object getLocation_updated_at() {
            return location_updated_at;
        }

        public void setLocation_updated_at(Object location_updated_at) {
            this.location_updated_at = location_updated_at;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public Object getIdcard() {
            return idcard;
        }

        public void setIdcard(Object idcard) {
            this.idcard = idcard;
        }

        public String getInvitation_code() {
            return invitation_code;
        }

        public void setInvitation_code(String invitation_code) {
            this.invitation_code = invitation_code;
        }

        public String getRc_token() {
            return rc_token;
        }

        public void setRc_token(String rc_token) {
            this.rc_token = rc_token;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getReceive_msg_tip() {
            return receive_msg_tip;
        }

        public void setReceive_msg_tip(int receive_msg_tip) {
            this.receive_msg_tip = receive_msg_tip;
        }

        public int getDisplay_user_name() {
            return display_user_name;
        }

        public void setDisplay_user_name(int display_user_name) {
            this.display_user_name = display_user_name;
        }

        public int getDisplay_phone() {
            return display_phone;
        }

        public void setDisplay_phone(int display_phone) {
            this.display_phone = display_phone;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public ResumeBean getResume() {
            return resume;
        }

        public void setResume(ResumeBean resume) {
            this.resume = resume;
        }

        public List<HobbiesBean> getHobbies() {
            return hobbies;
        }

        public void setHobbies(List<HobbiesBean> hobbies) {
            this.hobbies = hobbies;
        }

        public List<ResourcesBean> getResources() {
            return resources;
        }

        public void setResources(List<ResourcesBean> resources) {
            this.resources = resources;
        }

        public static class ResumeBean {
            /**
             * id : 1
             * user_id : 1
             * headimgurl : https://wx.qlogo.cn/mmopen/vi_32/9nnnKUylibl9iakAEWl2SbM2po9fs9kpaLouGgEBVXe6Z8gBBdCuePlofiaHuDorQTzgWfLRMjwp2mc01U7aqUHuw/0
             * user_name : 黄桂旋
             * sex : 1
             * highest_education : 本科
             * work_age : 3
             * city : 深圳市
             * phone : 13714876874
             * email : 313066164@qq.com
             * created_at : null
             * updated_at : null
             * education_exprience : [{"id":1,"school":"苏州大学","major":"通信工程","graduated_at":"2011-06","education":"本科","resume_id":1,"created_at":"2017-08-27 14:44:47","updated_at":null}]
             * work_exprience : [{"id":1,"company":"思路飞扬","job":"软件开发","time_begin":"2017-01","time_end":"2017-02","work_content":"打酱油","resume_id":1,"created_at":null,"updated_at":null},{"id":2,"company":"xxx公司","job":"服务器","time_begin":"2017-03","time_end":"至今","work_content":"呵呵呵","resume_id":1,"created_at":null,"updated_at":null}]
             */

            private int id;
            private int user_id;
            private String headimgurl;
            private String user_name;
            private int sex;
            private String highest_education;
            private int work_age;
            private String city;
            private String phone;
            private String email;
            private Object created_at;
            private Object updated_at;
            private List<EducationExprienceBean> education_exprience;
            private List<WorkExprienceBean> work_exprience;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getHeadimgurl() {
                return headimgurl;
            }

            public void setHeadimgurl(String headimgurl) {
                this.headimgurl = headimgurl;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getHighest_education() {
                return highest_education;
            }

            public void setHighest_education(String highest_education) {
                this.highest_education = highest_education;
            }

            public int getWork_age() {
                return work_age;
            }

            public void setWork_age(int work_age) {
                this.work_age = work_age;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public Object getCreated_at() {
                return created_at;
            }

            public void setCreated_at(Object created_at) {
                this.created_at = created_at;
            }

            public Object getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(Object updated_at) {
                this.updated_at = updated_at;
            }

            public List<EducationExprienceBean> getEducation_exprience() {
                return education_exprience;
            }

            public void setEducation_exprience(List<EducationExprienceBean> education_exprience) {
                this.education_exprience = education_exprience;
            }

            public List<WorkExprienceBean> getWork_exprience() {
                return work_exprience;
            }

            public void setWork_exprience(List<WorkExprienceBean> work_exprience) {
                this.work_exprience = work_exprience;
            }

            public static class EducationExprienceBean {
                /**
                 * id : 1
                 * school : 苏州大学
                 * major : 通信工程
                 * graduated_at : 2011-06
                 * education : 本科
                 * resume_id : 1
                 * created_at : 2017-08-27 14:44:47
                 * updated_at : null
                 */

                private int id;
                private String school;
                private String major;
                private String graduated_at;
                private String education;
                private int resume_id;
                private String created_at;
                private Object updated_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getSchool() {
                    return school;
                }

                public void setSchool(String school) {
                    this.school = school;
                }

                public String getMajor() {
                    return major;
                }

                public void setMajor(String major) {
                    this.major = major;
                }

                public String getGraduated_at() {
                    return graduated_at;
                }

                public void setGraduated_at(String graduated_at) {
                    this.graduated_at = graduated_at;
                }

                public String getEducation() {
                    return education;
                }

                public void setEducation(String education) {
                    this.education = education;
                }

                public int getResume_id() {
                    return resume_id;
                }

                public void setResume_id(int resume_id) {
                    this.resume_id = resume_id;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public Object getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(Object updated_at) {
                    this.updated_at = updated_at;
                }
            }

            public static class WorkExprienceBean {
                /**
                 * id : 1
                 * company : 思路飞扬
                 * job : 软件开发
                 * time_begin : 2017-01
                 * time_end : 2017-02
                 * work_content : 打酱油
                 * resume_id : 1
                 * created_at : null
                 * updated_at : null
                 */

                private int id;
                private String company;
                private String job;
                private String time_begin;
                private String time_end;
                private String work_content;
                private int resume_id;
                private Object created_at;
                private Object updated_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getCompany() {
                    return company;
                }

                public void setCompany(String company) {
                    this.company = company;
                }

                public String getJob() {
                    return job;
                }

                public void setJob(String job) {
                    this.job = job;
                }

                public String getTime_begin() {
                    return time_begin;
                }

                public void setTime_begin(String time_begin) {
                    this.time_begin = time_begin;
                }

                public String getTime_end() {
                    return time_end;
                }

                public void setTime_end(String time_end) {
                    this.time_end = time_end;
                }

                public String getWork_content() {
                    return work_content;
                }

                public void setWork_content(String work_content) {
                    this.work_content = work_content;
                }

                public int getResume_id() {
                    return resume_id;
                }

                public void setResume_id(int resume_id) {
                    this.resume_id = resume_id;
                }

                public Object getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(Object created_at) {
                    this.created_at = created_at;
                }

                public Object getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(Object updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }

        public static class HobbiesBean {
            /**
             * id : 1
             * name : 唱歌
             * created_at : null
             * updated_at : null
             * pivot : {"user_id":1,"hobby_id":1,"created_at":"2017-08-26 23:37:15","updated_at":null}
             */

            private int id;
            private String name;
            private Object created_at;
            private Object updated_at;
            private PivotBean pivot;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getCreated_at() {
                return created_at;
            }

            public void setCreated_at(Object created_at) {
                this.created_at = created_at;
            }

            public Object getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(Object updated_at) {
                this.updated_at = updated_at;
            }

            public PivotBean getPivot() {
                return pivot;
            }

            public void setPivot(PivotBean pivot) {
                this.pivot = pivot;
            }

            public static class PivotBean {
                /**
                 * user_id : 1
                 * hobby_id : 1
                 * created_at : 2017-08-26 23:37:15
                 * updated_at : null
                 */

                private int user_id;
                private int hobby_id;
                private String created_at;
                private Object updated_at;

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getHobby_id() {
                    return hobby_id;
                }

                public void setHobby_id(int hobby_id) {
                    this.hobby_id = hobby_id;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public Object getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(Object updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }

        public static class ResourcesBean {
            /**
             * id : 2
             * name : 教育资源
             * created_at : 2017-08-26 23:51:42
             * updated_at : null
             * pivot : {"user_id":1,"resource_id":2,"created_at":"2017-08-26 23:51:52","updated_at":null}
             */

            private int id;
            private String name;
            private String created_at;
            private Object updated_at;
            private PivotBeanX pivot;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public Object getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(Object updated_at) {
                this.updated_at = updated_at;
            }

            public PivotBeanX getPivot() {
                return pivot;
            }

            public void setPivot(PivotBeanX pivot) {
                this.pivot = pivot;
            }

            public static class PivotBeanX {
                /**
                 * user_id : 1
                 * resource_id : 2
                 * created_at : 2017-08-26 23:51:52
                 * updated_at : null
                 */

                private int user_id;
                private int resource_id;
                private String created_at;
                private Object updated_at;

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getResource_id() {
                    return resource_id;
                }

                public void setResource_id(int resource_id) {
                    this.resource_id = resource_id;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public Object getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(Object updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}
