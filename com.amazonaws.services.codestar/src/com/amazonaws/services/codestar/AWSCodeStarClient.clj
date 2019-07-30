(ns com.amazonaws.services.codestar.AWSCodeStarClient
  "Client for accessing CodeStar. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.codestar AWSCodeStarClient]))

(defn *builder
  "returns: `com.amazonaws.services.codestar.AWSCodeStarClientBuilder`"
  (^com.amazonaws.services.codestar.AWSCodeStarClientBuilder []
    (AWSCodeStarClient/builder )))

(defn list-team-members
  "Lists all team members associated with a project.

  request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`

  returns: Result of the ListTeamMembers operation returned by the service. - `com.amazonaws.services.codestar.model.ListTeamMembersResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListTeamMembersResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request]
    (-> this (.listTeamMembers request))))

(defn describe-user-profile
  "Describes a user in AWS CodeStar and the user attributes across all projects.

  request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`

  returns: Result of the DescribeUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileNotFoundException - The user profile was not found."
  (^com.amazonaws.services.codestar.model.DescribeUserProfileResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request]
    (-> this (.describeUserProfile request))))

(defn describe-project
  "Describes a project and its resources.

  request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.codestar.model.DescribeProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.DescribeProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn disassociate-team-member
  "Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
   allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
   from AWS CodeStar. It does not remove the user from IAM.

  request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`

  returns: Result of the DisassociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.DisassociateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.DisassociateTeamMemberResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request]
    (-> this (.disassociateTeamMember request))))

(defn delete-user-profile
  "Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
   as display name and email address. It does not delete the history of that user, for example the history of
   commits made by that user.

  request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteUserProfileResult`

  throws: com.amazonaws.services.codestar.model.ValidationException - The specified input is either not valid, or it could not be validated."
  (^com.amazonaws.services.codestar.model.DeleteUserProfileResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfile request))))

(defn update-user-profile
  "Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileNotFoundException - The user profile was not found."
  (^com.amazonaws.services.codestar.model.UpdateUserProfileResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfile request))))

(defn create-project
  "Creates a project, including project resources. This action creates a project based on a submitted project
   request. A set of source code files and a toolchain template file can be included with the project request. If
   these are not provided, an empty project is created.

  request - `com.amazonaws.services.codestar.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codestar.model.CreateProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectAlreadyExistsException - An AWS CodeStar project with the same ID already exists in this region for the AWS account. AWS CodeStar project IDs must be unique within a region for the AWS account."
  (^com.amazonaws.services.codestar.model.CreateProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn list-resources
  "Lists resources associated with a project in AWS CodeStar.

  request - `com.amazonaws.services.codestar.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.codestar.model.ListResourcesResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListResourcesResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn list-user-profiles
  "Lists all the user profiles configured for your AWS account in AWS CodeStar.

  request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`

  returns: Result of the ListUserProfiles operation returned by the service. - `com.amazonaws.services.codestar.model.ListUserProfilesResult`

  throws: com.amazonaws.services.codestar.model.InvalidNextTokenException - The next token is not valid."
  (^com.amazonaws.services.codestar.model.ListUserProfilesResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request]
    (-> this (.listUserProfiles request))))

(defn create-user-profile
  "Creates a profile for a user that includes user preferences, such as the display name and email address
   assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.codestar.model.CreateUserProfileResult`

  throws: com.amazonaws.services.codestar.model.UserProfileAlreadyExistsException - A user profile with that name already exists in this region for the AWS account. AWS CodeStar user profile names must be unique within a region for the AWS account."
  (^com.amazonaws.services.codestar.model.CreateUserProfileResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request]
    (-> this (.createUserProfile request))))

(defn list-projects
  "Lists all projects in AWS CodeStar associated with your AWS account.

  request - `com.amazonaws.services.codestar.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codestar.model.ListProjectsResult`

  throws: com.amazonaws.services.codestar.model.InvalidNextTokenException - The next token is not valid."
  (^com.amazonaws.services.codestar.model.ListProjectsResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn update-project
  "Updates a project in AWS CodeStar.

  request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.UpdateProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn list-tags-for-project
  "Gets the tags for a project.

  request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`

  returns: Result of the ListTagsForProject operation returned by the service. - `com.amazonaws.services.codestar.model.ListTagsForProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.ListTagsForProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request]
    (-> this (.listTagsForProject request))))

(defn update-team-member
  "Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
   in the project, or change whether they have remote access to project resources.

  request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`

  returns: Result of the UpdateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.UpdateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.LimitExceededException - A resource limit has been exceeded."
  (^com.amazonaws.services.codestar.model.UpdateTeamMemberResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request]
    (-> this (.updateTeamMember request))))

(defn associate-team-member
  "Adds an IAM user to the team for an AWS CodeStar project.

  request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`

  returns: Result of the AssociateTeamMember operation returned by the service. - `com.amazonaws.services.codestar.model.AssociateTeamMemberResult`

  throws: com.amazonaws.services.codestar.model.LimitExceededException - A resource limit has been exceeded."
  (^com.amazonaws.services.codestar.model.AssociateTeamMemberResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request]
    (-> this (.associateTeamMember request))))

(defn tag-project
  "Adds tags to a project.

  request - `com.amazonaws.services.codestar.model.TagProjectRequest`

  returns: Result of the TagProject operation returned by the service. - `com.amazonaws.services.codestar.model.TagProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.TagProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.TagProjectRequest request]
    (-> this (.tagProject request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodeStarClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Deletes a project, including project resources. Does not delete users associated with the project, but does
   delete the IAM roles that allowed access to the project.

  request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codestar.model.DeleteProjectResult`

  throws: com.amazonaws.services.codestar.model.ConcurrentModificationException - Another modification is being made. That modification must complete before you can make your change."
  (^com.amazonaws.services.codestar.model.DeleteProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn untag-project
  "Removes tags from a project.

  request - `com.amazonaws.services.codestar.model.UntagProjectRequest`

  returns: Result of the UntagProject operation returned by the service. - `com.amazonaws.services.codestar.model.UntagProjectResult`

  throws: com.amazonaws.services.codestar.model.ProjectNotFoundException - The specified AWS CodeStar project was not found."
  (^com.amazonaws.services.codestar.model.UntagProjectResult [^AWSCodeStarClient this ^com.amazonaws.services.codestar.model.UntagProjectRequest request]
    (-> this (.untagProject request))))

