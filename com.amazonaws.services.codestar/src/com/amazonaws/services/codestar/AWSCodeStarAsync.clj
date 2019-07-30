(ns com.amazonaws.services.codestar.AWSCodeStarAsync
  "Interface for accessing CodeStar asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeStarAsync instead.


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
  (:import [com.amazonaws.services.codestar AWSCodeStarAsync]))

(defn tag-project-async
  "Adds tags to a project.

  tag-project-request - `com.amazonaws.services.codestar.model.TagProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.TagProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.TagProjectRequest tag-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagProjectAsync tag-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.TagProjectRequest tag-project-request]
    (-> this (.tagProjectAsync tag-project-request))))

(defn update-project-async
  "Updates a project in AWS CodeStar.

  update-project-request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateProjectRequest update-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync update-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProjectAsync update-project-request))))

(defn create-project-async
  "Creates a project, including project resources. This action creates a project based on a submitted project
   request. A set of source code files and a toolchain template file can be included with the project request. If
   these are not provided, an empty project is created.

  create-project-request - `com.amazonaws.services.codestar.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateProjectRequest create-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync create-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateProjectRequest create-project-request]
    (-> this (.createProjectAsync create-project-request))))

(defn list-projects-async
  "Lists all projects in AWS CodeStar associated with your AWS account.

  list-projects-request - `com.amazonaws.services.codestar.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListProjectsRequest list-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync list-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjectsAsync list-projects-request))))

(defn disassociate-team-member-async
  "Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
   allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
   from AWS CodeStar. It does not remove the user from IAM.

  disassociate-team-member-request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DisassociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest disassociate-team-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTeamMemberAsync disassociate-team-member-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest disassociate-team-member-request]
    (-> this (.disassociateTeamMemberAsync disassociate-team-member-request))))

(defn untag-project-async
  "Removes tags from a project.

  untag-project-request - `com.amazonaws.services.codestar.model.UntagProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UntagProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UntagProjectRequest untag-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagProjectAsync untag-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UntagProjectRequest untag-project-request]
    (-> this (.untagProjectAsync untag-project-request))))

(defn delete-project-async
  "Deletes a project, including project resources. Does not delete users associated with the project, but does
   delete the IAM roles that allowed access to the project.

  delete-project-request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteProjectRequest delete-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync delete-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProjectAsync delete-project-request))))

(defn describe-project-async
  "Describes a project and its resources.

  describe-project-request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeProjectRequest describe-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync describe-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProjectAsync describe-project-request))))

(defn create-user-profile-async
  "Creates a profile for a user that includes user preferences, such as the display name and email address
   assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  create-user-profile-request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest create-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserProfileAsync create-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest create-user-profile-request]
    (-> this (.createUserProfileAsync create-user-profile-request))))

(defn list-user-profiles-async
  "Lists all the user profiles configured for your AWS account in AWS CodeStar.

  list-user-profiles-request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListUserProfilesResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest list-user-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserProfilesAsync list-user-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest list-user-profiles-request]
    (-> this (.listUserProfilesAsync list-user-profiles-request))))

(defn list-resources-async
  "Lists resources associated with a project in AWS CodeStar.

  list-resources-request - `com.amazonaws.services.codestar.model.ListResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListResourcesRequest list-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync list-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListResourcesRequest list-resources-request]
    (-> this (.listResourcesAsync list-resources-request))))

(defn associate-team-member-async
  "Adds an IAM user to the team for an AWS CodeStar project.

  associate-team-member-request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.AssociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest associate-team-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTeamMemberAsync associate-team-member-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest associate-team-member-request]
    (-> this (.associateTeamMemberAsync associate-team-member-request))))

(defn describe-user-profile-async
  "Describes a user in AWS CodeStar and the user attributes across all projects.

  describe-user-profile-request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest describe-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserProfileAsync describe-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest describe-user-profile-request]
    (-> this (.describeUserProfileAsync describe-user-profile-request))))

(defn delete-user-profile-async
  "Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
   as display name and email address. It does not delete the history of that user, for example the history of
   commits made by that user.

  delete-user-profile-request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest delete-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserProfileAsync delete-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest delete-user-profile-request]
    (-> this (.deleteUserProfileAsync delete-user-profile-request))))

(defn update-user-profile-async
  "Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
   profile is displayed wherever the user's information appears to other users in AWS CodeStar.

  update-user-profile-request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest update-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserProfileAsync update-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest update-user-profile-request]
    (-> this (.updateUserProfileAsync update-user-profile-request))))

(defn list-team-members-async
  "Lists all team members associated with a project.

  list-team-members-request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTeamMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTeamMembersResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest list-team-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTeamMembersAsync list-team-members-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest list-team-members-request]
    (-> this (.listTeamMembersAsync list-team-members-request))))

(defn update-team-member-async
  "Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
   in the project, or change whether they have remote access to project resources.

  update-team-member-request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest update-team-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTeamMemberAsync update-team-member-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest update-team-member-request]
    (-> this (.updateTeamMemberAsync update-team-member-request))))

(defn list-tags-for-project-async
  "Gets the tags for a project.

  list-tags-for-project-request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTagsForProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest list-tags-for-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForProjectAsync list-tags-for-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsync this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest list-tags-for-project-request]
    (-> this (.listTagsForProjectAsync list-tags-for-project-request))))

