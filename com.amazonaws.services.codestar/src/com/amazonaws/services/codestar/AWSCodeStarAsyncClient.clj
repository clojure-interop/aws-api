(ns com.amazonaws.services.codestar.AWSCodeStarAsyncClient
  "Client for accessing CodeStar asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

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
  (:import [com.amazonaws.services.codestar AWSCodeStarAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.codestar.AWSCodeStarAsyncClientBuilder`"
  (^com.amazonaws.services.codestar.AWSCodeStarAsyncClientBuilder []
    (AWSCodeStarAsyncClient/asyncBuilder )))

(defn tag-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.TagProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.TagProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.TagProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.TagProjectRequest request]
    (-> this (.tagProjectAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCodeStarAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.CreateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn disassociate-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DisassociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest request]
    (-> this (.disassociateTeamMemberAsync request))))

(defn untag-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UntagProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UntagProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UntagProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UntagProjectRequest request]
    (-> this (.untagProjectAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCodeStarAsyncClient this]
    (-> this (.shutdown))))

(defn delete-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DeleteProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn describe-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DescribeProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DescribeProjectRequest request]
    (-> this (.describeProjectAsync request))))

(defn create-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.CreateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.CreateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.CreateUserProfileRequest request]
    (-> this (.createUserProfileAsync request))))

(defn list-user-profiles-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListUserProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListUserProfilesResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListUserProfilesRequest request]
    (-> this (.listUserProfilesAsync request))))

(defn list-resources-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListResourcesRequest request]
    (-> this (.listResourcesAsync request))))

(defn associate-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.AssociateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.AssociateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.AssociateTeamMemberRequest request]
    (-> this (.associateTeamMemberAsync request))))

(defn describe-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DescribeUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DescribeUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DescribeUserProfileRequest request]
    (-> this (.describeUserProfileAsync request))))

(defn delete-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.DeleteUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.DeleteUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfileAsync request))))

(defn update-user-profile-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfileAsync request))))

(defn list-team-members-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListTeamMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTeamMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTeamMembersResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTeamMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListTeamMembersRequest request]
    (-> this (.listTeamMembersAsync request))))

(defn update-team-member-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.UpdateTeamMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTeamMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.UpdateTeamMemberResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTeamMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.UpdateTeamMemberRequest request]
    (-> this (.updateTeamMemberAsync request))))

(defn list-tags-for-project-async
  "Description copied from interface: AWSCodeStarAsync

  request - `com.amazonaws.services.codestar.model.ListTagsForProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codestar.model.ListTagsForProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeStarAsyncClient this ^com.amazonaws.services.codestar.model.ListTagsForProjectRequest request]
    (-> this (.listTagsForProjectAsync request))))

