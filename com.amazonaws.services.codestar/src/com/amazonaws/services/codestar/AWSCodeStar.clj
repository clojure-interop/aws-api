(ns com.amazonaws.services.codestar.AWSCodeStar
  "Interface for accessing CodeStar.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeStar instead.


  AWS CodeStar

  This is the API reference for AWS CodeStar. This reference provides descriptions of the operations and data types for
  the AWS CodeStar API along with usage examples.


  You can use the AWS CodeStar API to work with:


  Projects and their resources, by calling the following:




  DeleteProject, which deletes a project.




  DescribeProject, which lists the attributes of a project.




  ListProjects, which lists all projects associated with your AWS account.




  ListResources, which lists the resources associated with a project.




  ListTagsForProject, which lists the tags associated with a project.




  TagProject, which adds tags to a project.




  UntagProject, which removes tags from a project.




  UpdateProject, which updates the attributes of a project.




  Teams and team members, by calling the following:




  AssociateTeamMember, which adds an IAM user to the team for a project.




  DisassociateTeamMember, which removes an IAM user from the team for a project.




  ListTeamMembers, which lists all the IAM users in the team for a project, including their roles and
  attributes.




  UpdateTeamMember, which updates a team member's attributes in a project.




  Users, by calling the following:




  CreateUserProfile, which creates a user profile that contains data associated with the user across all
  projects.




  DeleteUserProfile, which deletes all user profile information across all projects.




  DescribeUserProfile, which describes the profile of a user.




  ListUserProfiles, which lists all user profiles.




  UpdateUserProfile, which updates the profile for a user."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codestar AWSCodeStar]))

(defn list-team-members
  "Lists all team members associated with a project.

  list-team-members-request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`

  returns: Result of the ListTeamMembers operation returned by the service. - `com.amazonaws.services.codestar.model.ListTeamMembersResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListTeamMembersResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest list-team-members-request]
    (-> this (.listTeamMembers list-team-members-request))))

(defn describe-user-profile
  "Describes a user in AWS CodeStar and the user attributes across all projects.

  describe-user-profile-request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`

  returns: Result of the DescribeUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileNotFoundException - The user profile was not found."
  (^com.amazonaws.services.codestar.model.DescribeUserProfileResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest describe-user-profile-request]
    (-> this (.describeUserProfile describe-user-profile-request))))

(defn describe-project
  "Describes a project and its resources.

  describe-project-request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.DescribeProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProject describe-project-request))))

(defn disassociate-team-member
  "Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
   allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
   from AWS CodeStar. It does not remove the user from IAM.

  disassociate-team-member-request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`

  returns: Result of the DisassociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.DisassociateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.DisassociateTeamMemberResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest disassociate-team-member-request]
    (-> this (.disassociateTeamMember disassociate-team-member-request))))

(defn delete-user-profile
  "Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
   as display name and email address. It does not delete the history of that user, for example the history of
   commits made by that user.

  delete-user-profile-request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteUserProfileResult`

  throws: com.amazonaws.services.codestar.model.ValidationException - The specified input is either not valid, or it could not be validated."
  (^com.amazonaws.services.codestar.model.DeleteUserProfileResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest delete-user-profile-request]
    (-> this (.deleteUserProfile delete-user-profile-request))))

(defn update-user-profile
  "Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  update-user-profile-request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileNotFoundException - The user profile was not found."
  (^com.amazonaws.services.codestar.model.UpdateUserProfileResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest update-user-profile-request]
    (-> this (.updateUserProfile update-user-profile-request))))

(defn create-project
  "Creates a project, including project resources. This action creates a project based on a submitted project
   request. A set of source code files and a toolchain template file can be included with the project request. If
   these are not provided, an empty project is created.

  create-project-request - `com.amazonaws.services.codestar.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codestar.model.CreateProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectAlreadyExistsException - An AWS CodeStar project with the same ID already exists in this region for the AWS account. AWS CodeStar project IDs must be unique within a region for the AWS account."
  (^com.amazonaws.services.codestar.model.CreateProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.CreateProjectRequest create-project-request]
    (-> this (.createProject create-project-request))))

(defn list-resources
  "Lists resources associated with a project in AWS CodeStar.

  list-resources-request - `com.amazonaws.services.codestar.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.codestar.model.ListResourcesResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListResourcesResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.ListResourcesRequest list-resources-request]
    (-> this (.listResources list-resources-request))))

(defn list-user-profiles
  "Lists all the user profiles configured for your AWS account in AWS CodeStar.

  list-user-profiles-request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`

  returns: Result of the ListUserProfiles operation returned by the service. - `com.amazonaws.services.codestar.model.ListUserProfilesResult`

  throws: com.amazonaws.services.codestar.model.InvalidNextTokenException - The next token is not valid."
  (^com.amazonaws.services.codestar.model.ListUserProfilesResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest list-user-profiles-request]
    (-> this (.listUserProfiles list-user-profiles-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCodeStar this]
    (-> this (.shutdown))))

(defn create-user-profile
  "Creates a profile for a user that includes user preferences, such as the display name and email address
   assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  create-user-profile-request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.CreateUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileAlreadyExistsException - A user profile with that name already exists in this region for the AWS account. AWS CodeStar user profile names must be unique within a region for the AWS account."
  (^com.amazonaws.services.codestar.model.CreateUserProfileResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest create-user-profile-request]
    (-> this (.createUserProfile create-user-profile-request))))

(defn list-projects
  "Lists all projects in AWS CodeStar associated with your AWS account.

  list-projects-request - `com.amazonaws.services.codestar.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codestar.model.ListProjectsResult`

  throws: com.amazonaws.services.codestar.model.InvalidNextTokenException - The next token is not valid."
  (^com.amazonaws.services.codestar.model.ListProjectsResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjects list-projects-request))))

(defn update-project
  "Updates a project in AWS CodeStar.

  update-project-request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.UpdateProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProject update-project-request))))

(defn list-tags-for-project
  "Gets the tags for a project.

  list-tags-for-project-request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`

  returns: Result of the ListTagsForProject operation returned by the service. - `com.amazonaws.services.codestar.model.ListTagsForProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListTagsForProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest list-tags-for-project-request]
    (-> this (.listTagsForProject list-tags-for-project-request))))

(defn update-team-member
  "Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
   in the project, or change whether they have remote access to project resources.

  update-team-member-request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`

  returns: Result of the UpdateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.LimitExceededException - A resource limit has been exceeded."
  (^com.amazonaws.services.codestar.model.UpdateTeamMemberResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest update-team-member-request]
    (-> this (.updateTeamMember update-team-member-request))))

(defn associate-team-member
  "Adds an IAM user to the team for an AWS CodeStar project.

  associate-team-member-request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`

  returns: Result of the AssociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.AssociateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.LimitExceededException - A resource limit has been exceeded."
  (^com.amazonaws.services.codestar.model.AssociateTeamMemberResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest associate-team-member-request]
    (-> this (.associateTeamMember associate-team-member-request))))

(defn tag-project
  "Adds tags to a project.

  tag-project-request - `com.amazonaws.services.codestar.model.TagProjectRequest`

  returns: Result of the TagProject operation returned by the service. - `com.amazonaws.services.codestar.model.TagProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.TagProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.TagProjectRequest tag-project-request]
    (-> this (.tagProject tag-project-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodeStar this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Deletes a project, including project resources. Does not delete users associated with the project, but does
   delete the IAM roles that allowed access to the project.

  delete-project-request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteProjectResult`

  throws: com.amazonaws.services.codestar.model.ConcurrentModificationException - Another modification is being made. That modification must complete before you can make your change."
  (^com.amazonaws.services.codestar.model.DeleteProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProject delete-project-request))))

(defn untag-project
  "Removes tags from a project.

  untag-project-request - `com.amazonaws.services.codestar.model.UntagProjectRequest`

  returns: Result of the UntagProject operation returned by the service. - `com.amazonaws.services.codestar.model.UntagProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.UntagProjectResult [^AWSCodeStar this ^com.amazonaws.services.codestar.model.UntagProjectRequest untag-project-request]
    (-> this (.untagProject untag-project-request))))

