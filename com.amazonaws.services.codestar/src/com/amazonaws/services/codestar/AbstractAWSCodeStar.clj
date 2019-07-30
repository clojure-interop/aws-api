(ns com.amazonaws.services.codestar.AbstractAWSCodeStar
  "Abstract implementation of AWSCodeStar. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codestar AbstractAWSCodeStar]))

(defn list-team-members
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`

  returns: Result of the ListTeamMembers operation returned by the service. - `com.amazonaws.services.codestar.model.ListTeamMembersResult`"
  (^com.amazonaws.services.codestar.model.ListTeamMembersResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request]
    (-> this (.listTeamMembers request))))

(defn describe-user-profile
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`

  returns: Result of the DescribeUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeUserProfileResult`"
  (^com.amazonaws.services.codestar.model.DescribeUserProfileResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request]
    (-> this (.describeUserProfile request))))

(defn describe-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeProjectResult`"
  (^com.amazonaws.services.codestar.model.DescribeProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn disassociate-team-member
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`

  returns: Result of the DisassociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.DisassociateTeamMemberResult`"
  (^com.amazonaws.services.codestar.model.DisassociateTeamMemberResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request]
    (-> this (.disassociateTeamMember request))))

(defn delete-user-profile
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteUserProfileResult`"
  (^com.amazonaws.services.codestar.model.DeleteUserProfileResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfile request))))

(defn update-user-profile
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateUserProfileResult`"
  (^com.amazonaws.services.codestar.model.UpdateUserProfileResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfile request))))

(defn create-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codestar.model.CreateProjectResult`"
  (^com.amazonaws.services.codestar.model.CreateProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn list-resources
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.codestar.model.ListResourcesResult`"
  (^com.amazonaws.services.codestar.model.ListResourcesResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn list-user-profiles
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`

  returns: Result of the ListUserProfiles operation returned by the service. - `com.amazonaws.services.codestar.model.ListUserProfilesResult`"
  (^com.amazonaws.services.codestar.model.ListUserProfilesResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request]
    (-> this (.listUserProfiles request))))

(defn shutdown
  "Description copied from interface: AWSCodeStar"
  ([^AbstractAWSCodeStar this]
    (-> this (.shutdown))))

(defn create-user-profile
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.CreateUserProfileResult`"
  (^com.amazonaws.services.codestar.model.CreateUserProfileResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request]
    (-> this (.createUserProfile request))))

(defn list-projects
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codestar.model.ListProjectsResult`"
  (^com.amazonaws.services.codestar.model.ListProjectsResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn update-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateProjectResult`"
  (^com.amazonaws.services.codestar.model.UpdateProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn list-tags-for-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`

  returns: Result of the ListTagsForProject operation returned by the service. - `com.amazonaws.services.codestar.model.ListTagsForProjectResult`"
  (^com.amazonaws.services.codestar.model.ListTagsForProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request]
    (-> this (.listTagsForProject request))))

(defn update-team-member
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`

  returns: Result of the UpdateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateTeamMemberResult`"
  (^com.amazonaws.services.codestar.model.UpdateTeamMemberResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request]
    (-> this (.updateTeamMember request))))

(defn associate-team-member
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`

  returns: Result of the AssociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.AssociateTeamMemberResult`"
  (^com.amazonaws.services.codestar.model.AssociateTeamMemberResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request]
    (-> this (.associateTeamMember request))))

(defn tag-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.TagProjectRequest`

  returns: Result of the TagProject operation returned by the service. - `com.amazonaws.services.codestar.model.TagProjectResult`"
  (^com.amazonaws.services.codestar.model.TagProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.TagProjectRequest request]
    (-> this (.tagProject request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCodeStar

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCodeStar this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteProjectResult`"
  (^com.amazonaws.services.codestar.model.DeleteProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn untag-project
  "Description copied from interface: AWSCodeStar

  request - `com.amazonaws.services.codestar.model.UntagProjectRequest`

  returns: Result of the UntagProject operation returned by the service. - `com.amazonaws.services.codestar.model.UntagProjectResult`"
  (^com.amazonaws.services.codestar.model.UntagProjectResult [^AbstractAWSCodeStar this ^com.amazonaws.services.codestar.model.UntagProjectRequest request]
    (-> this (.untagProject request))))

