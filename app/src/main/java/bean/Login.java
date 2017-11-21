package bean;

import java.util.List;

/**
 * Created by Hao on 2017/11/8.
 */

public class Login {

    /**
     * code : 0
     * msg :
     * data : {"id":3,"unionid":null,"xcx_openid":null,"gzh_openid":null,"wx_nickname":null,"created_at":"2017-11-03 14:36:16","deleted_at":null,"wx_subscribe":1,"wx_headimgurl":null,"wx_city":null,"wx_province":null,"updated_at":"2017-11-08 15:29:44","lat":"30.628962","lng":"104.067754","location_updated_at":"2017-11-08 15:29:44","sex":0,"phone":"13689652209","real_name":"邓大萍","idcard":null,"invitation_code":"232860","rc_token":"H56ggHZAY2chxmYog90Dik330YBMSAOqAA//8hdfNenFLIUBgYLrBy+6Gzdd4qYoX4Js13EgnhcOzMTaMpRCu4wFP6OPJSLi","headimgurl":"http://dinner.lewitech.cn/upload/img/2017-11-03/r1509691014503071.jpg","company":null,"job":null,"nickname":"流年过往","receive_msg_tip":1,"display_user_name":1,"display_phone":1,"resume_attachment_url":null,"access_token":"b6e83733353fa8d9f7e8323220f79895","hobbies":[{"id":13,"name":"动漫","created_at":"2017-09-29 13:01:40","updated_at":null,"type":0,"pivot":{"user_id":3,"hobby_id":13,"created_at":"2017-11-03 14:38:53","updated_at":"2017-11-03 14:38:53"}}],"resources":[{"id":18,"name":"媒体音乐","created_at":"2017-09-29 13:04:37","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":18,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}},{"id":14,"name":"影视","created_at":"2017-09-29 13:03:34","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":14,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}},{"id":15,"name":"传媒","created_at":"2017-09-29 13:03:39","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":15,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}}],"resume":{"id":3,"user_id":3,"headimgurl":"http://dinner.lewitech.cn/upload/img/2017-11-03/r1509695768983596.jpg","user_name":"邓大萍","sex":1,"highest_education":"本科","work_age":"5","city":"成都","phone":"13678131752","email":"444520869@qq.com","created_at":"2017-11-03 15:55:02","updated_at":"2017-11-03 15:57:57","education_exprience":[],"work_exprience":[]}}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 3
         * unionid : null
         * xcx_openid : null
         * gzh_openid : null
         * wx_nickname : null
         * created_at : 2017-11-03 14:36:16
         * deleted_at : null
         * wx_subscribe : 1
         * wx_headimgurl : null
         * wx_city : null
         * wx_province : null
         * updated_at : 2017-11-08 15:29:44
         * lat : 30.628962
         * lng : 104.067754
         * location_updated_at : 2017-11-08 15:29:44
         * sex : 0
         * phone : 13689652209
         * real_name : 邓大萍
         * idcard : null
         * invitation_code : 232860
         * rc_token : H56ggHZAY2chxmYog90Dik330YBMSAOqAA//8hdfNenFLIUBgYLrBy+6Gzdd4qYoX4Js13EgnhcOzMTaMpRCu4wFP6OPJSLi
         * headimgurl : http://dinner.lewitech.cn/upload/img/2017-11-03/r1509691014503071.jpg
         * company : null
         * job : null
         * nickname : 流年过往
         * receive_msg_tip : 1
         * display_user_name : 1
         * display_phone : 1
         * resume_attachment_url : null
         * access_token : b6e83733353fa8d9f7e8323220f79895
         * hobbies : [{"id":13,"name":"动漫","created_at":"2017-09-29 13:01:40","updated_at":null,"type":0,"pivot":{"user_id":3,"hobby_id":13,"created_at":"2017-11-03 14:38:53","updated_at":"2017-11-03 14:38:53"}}]
         * resources : [{"id":18,"name":"媒体音乐","created_at":"2017-09-29 13:04:37","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":18,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}},{"id":14,"name":"影视","created_at":"2017-09-29 13:03:34","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":14,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}},{"id":15,"name":"传媒","created_at":"2017-09-29 13:03:39","updated_at":null,"type":0,"pivot":{"user_id":3,"resource_id":15,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}}]
         * resume : {"id":3,"user_id":3,"headimgurl":"http://dinner.lewitech.cn/upload/img/2017-11-03/r1509695768983596.jpg","user_name":"邓大萍","sex":1,"highest_education":"本科","work_age":"5","city":"成都","phone":"13678131752","email":"444520869@qq.com","created_at":"2017-11-03 15:55:02","updated_at":"2017-11-03 15:57:57","education_exprience":[],"work_exprience":[]}
         */

        private int id;
        private Object unionid;
        private Object xcx_openid;
        private Object gzh_openid;
        private Object wx_nickname;
        private String created_at;
        private Object deleted_at;
        private int wx_subscribe;
        private Object wx_headimgurl;
        private Object wx_city;
        private Object wx_province;
        private String updated_at;
        private String lat;
        private String lng;
        private String location_updated_at;
        private int sex;
        private String phone;
        private String real_name;
        private Object idcard;
        private String invitation_code;
        private String rc_token;
        private String headimgurl;
        private Object company;
        private Object job;
        private String nickname;
        private int receive_msg_tip;
        private int display_user_name;
        private int display_phone;
        private Object resume_attachment_url;
        private String access_token;
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

        public Object getWx_nickname() {
            return wx_nickname;
        }

        public void setWx_nickname(Object wx_nickname) {
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

        public String getLocation_updated_at() {
            return location_updated_at;
        }

        public void setLocation_updated_at(String location_updated_at) {
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

        public Object getCompany() {
            return company;
        }

        public void setCompany(Object company) {
            this.company = company;
        }

        public Object getJob() {
            return job;
        }

        public void setJob(Object job) {
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

        public Object getResume_attachment_url() {
            return resume_attachment_url;
        }

        public void setResume_attachment_url(Object resume_attachment_url) {
            this.resume_attachment_url = resume_attachment_url;
        }

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
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
             * id : 3
             * user_id : 3
             * headimgurl : http://dinner.lewitech.cn/upload/img/2017-11-03/r1509695768983596.jpg
             * user_name : 邓大萍
             * sex : 1
             * highest_education : 本科
             * work_age : 5
             * city : 成都
             * phone : 13678131752
             * email : 444520869@qq.com
             * created_at : 2017-11-03 15:55:02
             * updated_at : 2017-11-03 15:57:57
             * education_exprience : []
             * work_exprience : []
             */

            private int id;
            private int user_id;
            private String headimgurl;
            private String user_name;
            private int sex;
            private String highest_education;
            private String work_age;
            private String city;
            private String phone;
            private String email;
            private String created_at;
            private String updated_at;
            private List<?> education_exprience;
            private List<?> work_exprience;

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

            public String getWork_age() {
                return work_age;
            }

            public void setWork_age(String work_age) {
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

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public List<?> getEducation_exprience() {
                return education_exprience;
            }

            public void setEducation_exprience(List<?> education_exprience) {
                this.education_exprience = education_exprience;
            }

            public List<?> getWork_exprience() {
                return work_exprience;
            }

            public void setWork_exprience(List<?> work_exprience) {
                this.work_exprience = work_exprience;
            }
        }

        public static class HobbiesBean {
            /**
             * id : 13
             * name : 动漫
             * created_at : 2017-09-29 13:01:40
             * updated_at : null
             * type : 0
             * pivot : {"user_id":3,"hobby_id":13,"created_at":"2017-11-03 14:38:53","updated_at":"2017-11-03 14:38:53"}
             */

            private int id;
            private String name;
            private String created_at;
            private Object updated_at;
            private int type;
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

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PivotBean getPivot() {
                return pivot;
            }

            public void setPivot(PivotBean pivot) {
                this.pivot = pivot;
            }

            public static class PivotBean {
                /**
                 * user_id : 3
                 * hobby_id : 13
                 * created_at : 2017-11-03 14:38:53
                 * updated_at : 2017-11-03 14:38:53
                 */

                private int user_id;
                private int hobby_id;
                private String created_at;
                private String updated_at;

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

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }

        public static class ResourcesBean {
            /**
             * id : 18
             * name : 媒体音乐
             * created_at : 2017-09-29 13:04:37
             * updated_at : null
             * type : 0
             * pivot : {"user_id":3,"resource_id":18,"created_at":"2017-11-03 16:18:38","updated_at":"2017-11-03 16:18:38"}
             */

            private int id;
            private String name;
            private String created_at;
            private Object updated_at;
            private int type;
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

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PivotBeanX getPivot() {
                return pivot;
            }

            public void setPivot(PivotBeanX pivot) {
                this.pivot = pivot;
            }

            public static class PivotBeanX {
                /**
                 * user_id : 3
                 * resource_id : 18
                 * created_at : 2017-11-03 16:18:38
                 * updated_at : 2017-11-03 16:18:38
                 */

                private int user_id;
                private int resource_id;
                private String created_at;
                private String updated_at;

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

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}
