(ns com.amazonaws.services.codestar.AbstractAWSCodeStarAsync
  "Abstract implementation of AWSCodeStarAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codestar AbstractAWSCodeStarAsync]))

(defn tag-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.TagProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.TagProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.TagProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.TagProjectRequest request]
    (-> this (.tagProjectAsync request))))

(defn update-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.CreateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn disassociate-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DisassociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request]
    (-> this (.disassociateTeamMemberAsync request))))

(defn untag-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UntagProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UntagProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UntagProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UntagProjectRequest request]
    (-> this (.untagProjectAsync request))))

(defn delete-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn describe-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request]
    (-> this (.describeProjectAsync request))))

(defn create-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request]
    (-> this (.createUserProfileAsync request))))

(defn list-user-profiles-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListUserProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request]
    (-> this (.listUserProfilesAsync request))))

(defn list-resources-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListResourcesRequest request]
    (-> this (.listResourcesAsync request))))

(defn associate-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.AssociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request]
    (-> this (.associateTeamMemberAsync request))))

(defn describe-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request]
    (-> this (.describeUserProfileAsync request))))

(defn delete-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfileAsync request))))

(defn update-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfileAsync request))))

(defn list-team-members-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTeamMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTeamMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTeamMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request]
    (-> this (.listTeamMembersAsync request))))

(defn update-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request]
    (-> this (.updateTeamMemberAsync request))))

(defn list-tags-for-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTagsForProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request]
    (-> this (.listTagsForProjectAsync request))))

