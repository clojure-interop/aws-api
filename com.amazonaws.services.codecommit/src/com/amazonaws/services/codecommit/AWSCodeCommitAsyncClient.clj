(ns com.amazonaws.services.codecommit.AWSCodeCommitAsyncClient
  "Client for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS CodeCommit

  This is the AWS CodeCommit API Reference. This reference provides descriptions of the operations and data
  types for AWS CodeCommit API along with usage examples.


  You can use the AWS CodeCommit API to work with the following objects:


  Repositories, by calling the following:




  BatchGetRepositories, which returns information about one or more repositories associated with your AWS
  account.




  CreateRepository, which creates an AWS CodeCommit repository.




  DeleteRepository, which deletes an AWS CodeCommit repository.




  GetRepository, which returns information about a specified repository.




  ListRepositories, which lists all AWS CodeCommit repositories associated with your AWS account.




  UpdateRepositoryDescription, which sets or updates the description of the repository.




  UpdateRepositoryName, which changes the name of the repository. If you change the name of a repository, no
  other users of that repository will be able to access it until you send them the new HTTPS or SSH URL to use.




  Branches, by calling the following:




  CreateBranch, which creates a new branch in a specified repository.




  DeleteBranch, which deletes the specified branch in a repository unless it is the default branch.




  GetBranch, which returns information about a specified branch.




  ListBranches, which lists all branches for a specified repository.




  UpdateDefaultBranch, which changes the default branch for a repository.




  Files, by calling the following:




  DeleteFile, which deletes the content of a specified file from a specified branch.




  GetBlob, which returns the base-64 encoded content of an individual Git blob object within a repository.




  GetFile, which returns the base-64 encoded content of a specified file.




  GetFolder, which returns the contents of a specified folder or directory.




  PutFile, which adds or modifies a single file in a specified repository and branch.




  Commits, by calling the following:




  CreateCommit, which creates a commit for changes to a repository.




  GetCommit, which returns information about a commit, including commit messages and author and committer
  information.




  GetDifferences, which returns information about the differences in a valid commit specifier (such as a branch,
  tag, HEAD, commit ID or other fully qualified reference).




  Merges, by calling the following:




  BatchDescribeMergeConflicts, which returns information about conflicts in a merge between commits in a
  repository.




  CreateUnreferencedMergeCommit, which creates an unreferenced commit between two branches or commits for the
  purpose of comparing them and identifying any potential conflicts.




  DescribeMergeConflicts, which returns information about merge conflicts between the base, source, and
  destination versions of a file in a potential merge.




  GetMergeCommit, which returns information about the merge between a source and destination commit.




  GetMergeConflicts, which returns information about merge conflicts between the source and destination branch
  in a pull request.




  GetMergeOptions, which returns information about the available merge options between two branches or commit
  specifiers.




  MergeBranchesByFastForward, which merges two branches using the fast-forward merge option.




  MergeBranchesBySquash, which merges two branches using the squash merge option.




  MergeBranchesByThreeWay, which merges two branches using the three-way merge option.




  Pull requests, by calling the following:




  CreatePullRequest, which creates a pull request in a specified repository.




  DescribePullRequestEvents, which returns information about one or more pull request events.




  GetCommentsForPullRequest, which returns information about comments on a specified pull request.




  GetPullRequest, which returns information about a specified pull request.




  ListPullRequests, which lists all pull requests for a repository.




  MergePullRequestByFastForward, which merges the source destination branch of a pull request into the specified
  destination branch for that pull request using the fast-forward merge option.




  MergePullRequestBySquash, which merges the source destination branch of a pull request into the specified
  destination branch for that pull request using the squash merge option.




  MergePullRequestByThreeWay. which merges the source destination branch of a pull request into the specified
  destination branch for that pull request using the three-way merge option.




  PostCommentForPullRequest, which posts a comment to a pull request at the specified line, file, or request.




  UpdatePullRequestDescription, which updates the description of a pull request.




  UpdatePullRequestStatus, which updates the status of a pull request.




  UpdatePullRequestTitle, which updates the title of a pull request.




  Comments in a repository, by calling the following:




  DeleteCommentContent, which deletes the content of a comment on a commit in a repository.




  GetComment, which returns information about a comment on a commit.




  GetCommentsForComparedCommit, which returns information about comments on the comparison between two commit
  specifiers in a repository.




  PostCommentForComparedCommit, which creates a comment on the comparison between two commit specifiers in a
  repository.




  PostCommentReply, which creates a reply to a comment.




  UpdateComment, which updates the content of a comment on a commit in a repository.




  Tags used to tag resources in AWS CodeCommit (not Git tags), by calling the following:




  ListTagsForResource, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
  CodeCommit.




  TagResource, which adds or updates tags for a resource in AWS CodeCommit.




  UntagResource, which removes tags for a resource in AWS CodeCommit.




  Triggers, by calling the following:




  GetRepositoryTriggers, which returns information about triggers configured for a repository.




  PutRepositoryTriggers, which replaces all triggers for a repository and can be used to create or delete
  triggers.




  TestRepositoryTriggers, which tests the functionality of a repository trigger by sending data to the trigger
  target.




  For information about how to use AWS CodeCommit, see the AWS CodeCommit User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codecommit AWSCodeCommitAsyncClient]))

(defn ->aws-code-commit-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCodeCommitAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodeCommitAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCodeCommitAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodeCommitAsyncClient aws-credentials executor-service))
  (^AWSCodeCommitAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodeCommitAsyncClient client-configuration))
  (^AWSCodeCommitAsyncClient []
    (new AWSCodeCommitAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.codecommit.AWSCodeCommitAsyncClientBuilder`"
  (^com.amazonaws.services.codecommit.AWSCodeCommitAsyncClientBuilder []
    (AWSCodeCommitAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn merge-pull-request-by-three-way-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestByThreeWay operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestByThreeWayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest request]
    (-> this (.mergePullRequestByThreeWayAsync request))))

(defn create-branch-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a create branch operation. - `com.amazonaws.services.codecommit.model.CreateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateBranchRequest request]
    (-> this (.createBranchAsync request))))

(defn batch-get-repositories-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a batch get repositories operation. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetRepositoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest request]
    (-> this (.batchGetRepositoriesAsync request))))

(defn delete-comment-content-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.DeleteCommentContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCommentContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteCommentContentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCommentContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest request]
    (-> this (.deleteCommentContentAsync request))))

(defn get-file-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetFileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetFileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetFileRequest request]
    (-> this (.getFileAsync request))))

(defn update-repository-description-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRepositoryDescriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest request]
    (-> this (.updateRepositoryDescriptionAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCodeCommitAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-repository-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a create repository operation. - `com.amazonaws.services.codecommit.model.CreateRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest request]
    (-> this (.createRepositoryAsync request))))

(defn get-folder-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetFolderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetFolderResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetFolderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetFolderRequest request]
    (-> this (.getFolderAsync request))))

(defn get-repository-triggers-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a get repository triggers operation. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest request]
    (-> this (.getRepositoryTriggersAsync request))))

(defn get-differences-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetDifferencesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDifferences operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetDifferencesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDifferencesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest request]
    (-> this (.getDifferencesAsync request))))

(defn update-default-branch-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of an update default branch operation. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDefaultBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDefaultBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest request]
    (-> this (.updateDefaultBranchAsync request))))

(defn put-file-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.PutFileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PutFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PutFileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putFileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PutFileRequest request]
    (-> this (.putFileAsync request))))

(defn delete-branch-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a delete branch operation. - `com.amazonaws.services.codecommit.model.DeleteBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest request]
    (-> this (.deleteBranchAsync request))))

(defn describe-merge-conflicts-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMergeConflictsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest request]
    (-> this (.describeMergeConflictsAsync request))))

(defn get-pull-request-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetPullRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPullRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest request]
    (-> this (.getPullRequestAsync request))))

(defn merge-pull-request-by-fast-forward-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestByFastForwardAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest request]
    (-> this (.mergePullRequestByFastForwardAsync request))))

(defn merge-branches-by-three-way-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesByThreeWay operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesByThreeWayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest request]
    (-> this (.mergeBranchesByThreeWayAsync request))))

(defn put-repository-triggers-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input ofa put repository triggers operation. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRepositoryTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest request]
    (-> this (.putRepositoryTriggersAsync request))))

(defn post-comment-for-compared-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentForComparedCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest request]
    (-> this (.postCommentForComparedCommitAsync request))))

(defn list-repositories-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a list repositories operation. - `com.amazonaws.services.codecommit.model.ListRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListRepositoriesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRepositoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest request]
    (-> this (.listRepositoriesAsync request))))

(defn update-pull-request-status-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest request]
    (-> this (.updatePullRequestStatusAsync request))))

(defn create-pull-request-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.CreatePullRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreatePullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPullRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest request]
    (-> this (.createPullRequestAsync request))))

(defn merge-branches-by-fast-forward-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesByFastForward operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesByFastForwardAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest request]
    (-> this (.mergeBranchesByFastForwardAsync request))))

(defn list-branches-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a list branches operation. - `com.amazonaws.services.codecommit.model.ListBranchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBranches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListBranchesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListBranchesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBranchesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListBranchesRequest request]
    (-> this (.listBranchesAsync request))))

(defn delete-repository-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a delete repository operation. - `com.amazonaws.services.codecommit.model.DeleteRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest request]
    (-> this (.deleteRepositoryAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCodeCommitAsyncClient this]
    (-> this (.shutdown))))

(defn get-comments-for-pull-request-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentsForPullRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest request]
    (-> this (.getCommentsForPullRequestAsync request))))

(defn get-merge-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetMergeCommitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest request]
    (-> this (.getMergeCommitAsync request))))

(defn delete-file-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.DeleteFileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteFileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DeleteFileRequest request]
    (-> this (.deleteFileAsync request))))

(defn merge-branches-by-squash-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesBySquash operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesBySquashAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest request]
    (-> this (.mergeBranchesBySquashAsync request))))

(defn get-repository-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a get repository operation. - `com.amazonaws.services.codecommit.model.GetRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest request]
    (-> this (.getRepositoryAsync request))))

(defn update-comment-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.UpdateCommentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateCommentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest request]
    (-> this (.updateCommentAsync request))))

(defn create-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.CreateCommitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateCommitRequest request]
    (-> this (.createCommitAsync request))))

(defn get-branch-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a get branch operation. - `com.amazonaws.services.codecommit.model.GetBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetBranchRequest request]
    (-> this (.getBranchAsync request))))

(defn list-pull-requests-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.ListPullRequestsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPullRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListPullRequestsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPullRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest request]
    (-> this (.listPullRequestsAsync request))))

(defn get-merge-conflicts-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetMergeConflictsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeConflictsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest request]
    (-> this (.getMergeConflictsAsync request))))

(defn update-repository-name-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRepositoryName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRepositoryNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest request]
    (-> this (.updateRepositoryNameAsync request))))

(defn post-comment-reply-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.PostCommentReplyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentReply operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentReplyResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentReplyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest request]
    (-> this (.postCommentReplyAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-merge-options-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetMergeOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeOptionsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest request]
    (-> this (.getMergeOptionsAsync request))))

(defn update-pull-request-description-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestDescriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest request]
    (-> this (.updatePullRequestDescriptionAsync request))))

(defn get-comments-for-compared-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentsForComparedCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest request]
    (-> this (.getCommentsForComparedCommitAsync request))))

(defn post-comment-for-pull-request-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentForPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentForPullRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest request]
    (-> this (.postCommentForPullRequestAsync request))))

(defn test-repository-triggers-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a test repository triggers operation. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRepositoryTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest request]
    (-> this (.testRepositoryTriggersAsync request))))

(defn create-unreferenced-merge-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUnreferencedMergeCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUnreferencedMergeCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest request]
    (-> this (.createUnreferencedMergeCommitAsync request))))

(defn update-pull-request-title-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestTitleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest request]
    (-> this (.updatePullRequestTitleAsync request))))

(defn get-blob-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a get blob operation. - `com.amazonaws.services.codecommit.model.GetBlobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetBlobResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetBlobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetBlobRequest request]
    (-> this (.getBlobAsync request))))

(defn get-commit-async
  "Description copied from interface: AWSCodeCommitAsync

  request - Represents the input of a get commit operation. - `com.amazonaws.services.codecommit.model.GetCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommitRequest request]
    (-> this (.getCommitAsync request))))

(defn batch-describe-merge-conflicts-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDescribeMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDescribeMergeConflictsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest request]
    (-> this (.batchDescribeMergeConflictsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-pull-request-events-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePullRequestEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePullRequestEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest request]
    (-> this (.describePullRequestEventsAsync request))))

(defn merge-pull-request-by-squash-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestBySquash operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestBySquashAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest request]
    (-> this (.mergePullRequestBySquashAsync request))))

(defn get-comment-async
  "Description copied from interface: AWSCodeCommitAsync

  request - `com.amazonaws.services.codecommit.model.GetCommentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsyncClient this ^com.amazonaws.services.codecommit.model.GetCommentRequest request]
    (-> this (.getCommentAsync request))))

