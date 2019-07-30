(ns com.amazonaws.services.codecommit.AWSCodeCommitAsync
  "Interface for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeCommitAsync instead.


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
  (:import [com.amazonaws.services.codecommit AWSCodeCommitAsync]))

(defn untag-resource-async
  "Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  untag-resource-request - `com.amazonaws.services.codecommit.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn merge-pull-request-by-three-way-async
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
   request.

  merge-pull-request-by-three-way-request - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestByThreeWay operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest merge-pull-request-by-three-way-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestByThreeWayAsync merge-pull-request-by-three-way-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest merge-pull-request-by-three-way-request]
    (-> this (.mergePullRequestByThreeWayAsync merge-pull-request-by-three-way-request))))

(defn create-branch-async
  "Creates a new branch in a repository and points the branch to a commit.



   Calling the create branch operation does not set a repository's default branch. To do this, call the update
   default branch operation.

  create-branch-request - Represents the input of a create branch operation. - `com.amazonaws.services.codecommit.model.CreateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateBranchRequest create-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBranchAsync create-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateBranchRequest create-branch-request]
    (-> this (.createBranchAsync create-branch-request))))

(defn batch-get-repositories-async
  "Returns information about one or more repositories.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  batch-get-repositories-request - Represents the input of a batch get repositories operation. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest batch-get-repositories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetRepositoriesAsync batch-get-repositories-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest batch-get-repositories-request]
    (-> this (.batchGetRepositoriesAsync batch-get-repositories-request))))

(defn delete-comment-content-async
  "Deletes the content of a comment made on a change, file, or commit in a repository.

  delete-comment-content-request - `com.amazonaws.services.codecommit.model.DeleteCommentContentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCommentContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteCommentContentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest delete-comment-content-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCommentContentAsync delete-comment-content-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest delete-comment-content-request]
    (-> this (.deleteCommentContentAsync delete-comment-content-request))))

(defn get-file-async
  "Returns the base-64 encoded contents of a specified file and its metadata.

  get-file-request - `com.amazonaws.services.codecommit.model.GetFileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetFileRequest get-file-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFileAsync get-file-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetFileRequest get-file-request]
    (-> this (.getFileAsync get-file-request))))

(defn update-repository-description-async
  "Sets or changes the comment or description for a repository.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  update-repository-description-request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest update-repository-description-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRepositoryDescriptionAsync update-repository-description-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest update-repository-description-request]
    (-> this (.updateRepositoryDescriptionAsync update-repository-description-request))))

(defn create-repository-async
  "Creates a new, empty repository.

  create-repository-request - Represents the input of a create repository operation. - `com.amazonaws.services.codecommit.model.CreateRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest create-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRepositoryAsync create-repository-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest create-repository-request]
    (-> this (.createRepositoryAsync create-repository-request))))

(defn get-folder-async
  "Returns the contents of a specified folder in a repository.

  get-folder-request - `com.amazonaws.services.codecommit.model.GetFolderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetFolderResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetFolderRequest get-folder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderAsync get-folder-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetFolderRequest get-folder-request]
    (-> this (.getFolderAsync get-folder-request))))

(defn get-repository-triggers-async
  "Gets information about triggers configured for a repository.

  get-repository-triggers-request - Represents the input of a get repository triggers operation. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest get-repository-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryTriggersAsync get-repository-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest get-repository-triggers-request]
    (-> this (.getRepositoryTriggersAsync get-repository-triggers-request))))

(defn get-differences-async
  "Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
   other fully qualified reference). Results can be limited to a specified path.

  get-differences-request - `com.amazonaws.services.codecommit.model.GetDifferencesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDifferences operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetDifferencesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest get-differences-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDifferencesAsync get-differences-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest get-differences-request]
    (-> this (.getDifferencesAsync get-differences-request))))

(defn update-default-branch-async
  "Sets or changes the default branch name for the specified repository.



   If you use this operation to change the default branch name to the current default branch name, a success message
   is returned even though the default branch did not change.

  update-default-branch-request - Represents the input of an update default branch operation. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDefaultBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest update-default-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDefaultBranchAsync update-default-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest update-default-branch-request]
    (-> this (.updateDefaultBranchAsync update-default-branch-request))))

(defn put-file-async
  "Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
   the specified branch.

  put-file-request - `com.amazonaws.services.codecommit.model.PutFileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PutFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PutFileRequest put-file-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putFileAsync put-file-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PutFileRequest put-file-request]
    (-> this (.putFileAsync put-file-request))))

(defn delete-branch-async
  "Deletes a branch from a repository, unless that branch is the default branch for the repository.

  delete-branch-request - Represents the input of a delete branch operation. - `com.amazonaws.services.codecommit.model.DeleteBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest delete-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBranchAsync delete-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest delete-branch-request]
    (-> this (.deleteBranchAsync delete-branch-request))))

(defn describe-merge-conflicts-async
  "Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
   squash or three-way merge strategy. If the merge option for the attempted merge is specified as
   FAST_FORWARD_MERGE, an exception will be thrown.

  describe-merge-conflicts-request - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest describe-merge-conflicts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMergeConflictsAsync describe-merge-conflicts-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest describe-merge-conflicts-request]
    (-> this (.describeMergeConflictsAsync describe-merge-conflicts-request))))

(defn get-pull-request-async
  "Gets information about a pull request in a specified repository.

  get-pull-request-request - `com.amazonaws.services.codecommit.model.GetPullRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest get-pull-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPullRequestAsync get-pull-request-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest get-pull-request-request]
    (-> this (.getPullRequestAsync get-pull-request-request))))

(defn merge-pull-request-by-fast-forward-async
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
   request.

  merge-pull-request-by-fast-forward-request - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest merge-pull-request-by-fast-forward-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestByFastForwardAsync merge-pull-request-by-fast-forward-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest merge-pull-request-by-fast-forward-request]
    (-> this (.mergePullRequestByFastForwardAsync merge-pull-request-by-fast-forward-request))))

(defn merge-branches-by-three-way-async
  "Merges two specified branches using the three-way merge strategy.

  merge-branches-by-three-way-request - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesByThreeWay operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest merge-branches-by-three-way-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesByThreeWayAsync merge-branches-by-three-way-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest merge-branches-by-three-way-request]
    (-> this (.mergeBranchesByThreeWayAsync merge-branches-by-three-way-request))))

(defn put-repository-triggers-async
  "Replaces all triggers for a repository. This can be used to create or delete triggers.

  put-repository-triggers-request - Represents the input ofa put repository triggers operation. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest put-repository-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRepositoryTriggersAsync put-repository-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest put-repository-triggers-request]
    (-> this (.putRepositoryTriggersAsync put-repository-triggers-request))))

(defn post-comment-for-compared-commit-async
  "Posts a comment on the comparison between two commits.

  post-comment-for-compared-commit-request - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest post-comment-for-compared-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentForComparedCommitAsync post-comment-for-compared-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest post-comment-for-compared-commit-request]
    (-> this (.postCommentForComparedCommitAsync post-comment-for-compared-commit-request))))

(defn list-repositories-async
  "Gets information about one or more repositories.

  list-repositories-request - Represents the input of a list repositories operation. - `com.amazonaws.services.codecommit.model.ListRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListRepositoriesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest list-repositories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRepositoriesAsync list-repositories-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest list-repositories-request]
    (-> this (.listRepositoriesAsync list-repositories-request))))

(defn update-pull-request-status-async
  "Updates the status of a pull request.

  update-pull-request-status-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest update-pull-request-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestStatusAsync update-pull-request-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest update-pull-request-status-request]
    (-> this (.updatePullRequestStatusAsync update-pull-request-status-request))))

(defn create-pull-request-async
  "Creates a pull request in the specified repository.

  create-pull-request-request - `com.amazonaws.services.codecommit.model.CreatePullRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreatePullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest create-pull-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPullRequestAsync create-pull-request-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest create-pull-request-request]
    (-> this (.createPullRequestAsync create-pull-request-request))))

(defn merge-branches-by-fast-forward-async
  "Merges two branches using the fast-forward merge strategy.

  merge-branches-by-fast-forward-request - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesByFastForward operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest merge-branches-by-fast-forward-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesByFastForwardAsync merge-branches-by-fast-forward-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest merge-branches-by-fast-forward-request]
    (-> this (.mergeBranchesByFastForwardAsync merge-branches-by-fast-forward-request))))

(defn list-branches-async
  "Gets information about one or more branches in a repository.

  list-branches-request - Represents the input of a list branches operation. - `com.amazonaws.services.codecommit.model.ListBranchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBranches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListBranchesResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListBranchesRequest list-branches-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBranchesAsync list-branches-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListBranchesRequest list-branches-request]
    (-> this (.listBranchesAsync list-branches-request))))

(defn delete-repository-async
  "Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.



   Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
   push calls to the deleted repository will fail.

  delete-repository-request - Represents the input of a delete repository operation. - `com.amazonaws.services.codecommit.model.DeleteRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest delete-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRepositoryAsync delete-repository-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest delete-repository-request]
    (-> this (.deleteRepositoryAsync delete-repository-request))))

(defn get-comments-for-pull-request-async
  "Returns comments made on a pull request.

  get-comments-for-pull-request-request - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest get-comments-for-pull-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentsForPullRequestAsync get-comments-for-pull-request-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest get-comments-for-pull-request-request]
    (-> this (.getCommentsForPullRequestAsync get-comments-for-pull-request-request))))

(defn get-merge-commit-async
  "Returns information about a specified merge commit.

  get-merge-commit-request - `com.amazonaws.services.codecommit.model.GetMergeCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest get-merge-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeCommitAsync get-merge-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest get-merge-commit-request]
    (-> this (.getMergeCommitAsync get-merge-commit-request))))

(defn delete-file-async
  "Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
   The file will still exist in the commits prior to the commit that contains the deletion.

  delete-file-request - `com.amazonaws.services.codecommit.model.DeleteFileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DeleteFileResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteFileRequest delete-file-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileAsync delete-file-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DeleteFileRequest delete-file-request]
    (-> this (.deleteFileAsync delete-file-request))))

(defn merge-branches-by-squash-async
  "Merges two branches using the squash merge strategy.

  merge-branches-by-squash-request - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergeBranchesBySquash operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest merge-branches-by-squash-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeBranchesBySquashAsync merge-branches-by-squash-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest merge-branches-by-squash-request]
    (-> this (.mergeBranchesBySquashAsync merge-branches-by-squash-request))))

(defn get-repository-async
  "Returns information about a repository.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  get-repository-request - Represents the input of a get repository operation. - `com.amazonaws.services.codecommit.model.GetRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetRepositoryResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest get-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRepositoryAsync get-repository-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest get-repository-request]
    (-> this (.getRepositoryAsync get-repository-request))))

(defn update-comment-async
  "Replaces the contents of a comment.

  update-comment-request - `com.amazonaws.services.codecommit.model.UpdateCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateCommentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest update-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCommentAsync update-comment-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest update-comment-request]
    (-> this (.updateCommentAsync update-comment-request))))

(defn create-commit-async
  "Creates a commit for a repository on the tip of a specified branch.

  create-commit-request - `com.amazonaws.services.codecommit.model.CreateCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateCommitRequest create-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCommitAsync create-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateCommitRequest create-commit-request]
    (-> this (.createCommitAsync create-commit-request))))

(defn get-branch-async
  "Returns information about a repository branch, including its name and the last commit ID.

  get-branch-request - Represents the input of a get branch operation. - `com.amazonaws.services.codecommit.model.GetBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetBranchResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetBranchRequest get-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBranchAsync get-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetBranchRequest get-branch-request]
    (-> this (.getBranchAsync get-branch-request))))

(defn list-pull-requests-async
  "Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
   or pull request author ARN.

  list-pull-requests-request - `com.amazonaws.services.codecommit.model.ListPullRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPullRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListPullRequestsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest list-pull-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPullRequestsAsync list-pull-requests-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest list-pull-requests-request]
    (-> this (.listPullRequestsAsync list-pull-requests-request))))

(defn get-merge-conflicts-async
  "Returns information about merge conflicts between the before and after commit IDs for a pull request in a
   repository.

  get-merge-conflicts-request - `com.amazonaws.services.codecommit.model.GetMergeConflictsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest get-merge-conflicts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeConflictsAsync get-merge-conflicts-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest get-merge-conflicts-request]
    (-> this (.getMergeConflictsAsync get-merge-conflicts-request))))

(defn update-repository-name-async
  "Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
   names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
   The suffix \".git\" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User
   Guide.

  update-repository-name-request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRepositoryName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest update-repository-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRepositoryNameAsync update-repository-name-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest update-repository-name-request]
    (-> this (.updateRepositoryNameAsync update-repository-name-request))))

(defn post-comment-reply-async
  "Posts a comment in reply to an existing comment on a comparison between commits or a pull request.

  post-comment-reply-request - `com.amazonaws.services.codecommit.model.PostCommentReplyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentReply operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentReplyResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest post-comment-reply-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentReplyAsync post-comment-reply-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest post-comment-reply-request]
    (-> this (.postCommentReplyAsync post-comment-reply-request))))

(defn list-tags-for-resource-async
  "Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
   resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  list-tags-for-resource-request - `com.amazonaws.services.codecommit.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-merge-options-async
  "Returns information about the merge options available for merging two specified branches. For details about why a
   particular merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.

  get-merge-options-request - `com.amazonaws.services.codecommit.model.GetMergeOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMergeOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetMergeOptionsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest get-merge-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMergeOptionsAsync get-merge-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest get-merge-options-request]
    (-> this (.getMergeOptionsAsync get-merge-options-request))))

(defn update-pull-request-description-async
  "Replaces the contents of the description of a pull request.

  update-pull-request-description-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest update-pull-request-description-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestDescriptionAsync update-pull-request-description-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest update-pull-request-description-request]
    (-> this (.updatePullRequestDescriptionAsync update-pull-request-description-request))))

(defn get-comments-for-compared-commit-async
  "Returns information about comments made on the comparison between two commits.

  get-comments-for-compared-commit-request - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest get-comments-for-compared-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentsForComparedCommitAsync get-comments-for-compared-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest get-comments-for-compared-commit-request]
    (-> this (.getCommentsForComparedCommitAsync get-comments-for-compared-commit-request))))

(defn post-comment-for-pull-request-async
  "Posts a comment on a pull request.

  post-comment-for-pull-request-request - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostCommentForPullRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest post-comment-for-pull-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postCommentForPullRequestAsync post-comment-for-pull-request-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest post-comment-for-pull-request-request]
    (-> this (.postCommentForPullRequestAsync post-comment-for-pull-request-request))))

(defn test-repository-triggers-async
  "Tests the functionality of repository triggers by sending information to the trigger target. If real data is
   available in the repository, the test will send data from the last commit. If no data is available, sample data
   will be generated.

  test-repository-triggers-request - Represents the input of a test repository triggers operation. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRepositoryTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest test-repository-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRepositoryTriggersAsync test-repository-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest test-repository-triggers-request]
    (-> this (.testRepositoryTriggersAsync test-repository-triggers-request))))

(defn create-unreferenced-merge-commit-async
  "Creates an unreferenced commit that represents the result of merging two branches using a specified merge
   strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
   fast-forward merge strategy, as that strategy does not create a merge commit.



   This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
   fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.

  create-unreferenced-merge-commit-request - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUnreferencedMergeCommit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest create-unreferenced-merge-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUnreferencedMergeCommitAsync create-unreferenced-merge-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest create-unreferenced-merge-commit-request]
    (-> this (.createUnreferencedMergeCommitAsync create-unreferenced-merge-commit-request))))

(defn update-pull-request-title-async
  "Replaces the title of a pull request.

  update-pull-request-title-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest update-pull-request-title-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePullRequestTitleAsync update-pull-request-title-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest update-pull-request-title-request]
    (-> this (.updatePullRequestTitleAsync update-pull-request-title-request))))

(defn get-blob-async
  "Returns the base-64 encoded content of an individual blob within a repository.

  get-blob-request - Represents the input of a get blob operation. - `com.amazonaws.services.codecommit.model.GetBlobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetBlobResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetBlobRequest get-blob-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlobAsync get-blob-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetBlobRequest get-blob-request]
    (-> this (.getBlobAsync get-blob-request))))

(defn get-commit-async
  "Returns information about a commit, including commit message and committer information.

  get-commit-request - Represents the input of a get commit operation. - `com.amazonaws.services.codecommit.model.GetCommitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCommit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommitResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommitRequest get-commit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommitAsync get-commit-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommitRequest get-commit-request]
    (-> this (.getCommitAsync get-commit-request))))

(defn batch-describe-merge-conflicts-async
  "Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
   squash or three-way merge strategy.

  batch-describe-merge-conflicts-request - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDescribeMergeConflicts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest batch-describe-merge-conflicts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDescribeMergeConflictsAsync batch-describe-merge-conflicts-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest batch-describe-merge-conflicts-request]
    (-> this (.batchDescribeMergeConflictsAsync batch-describe-merge-conflicts-request))))

(defn tag-resource-async
  "Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  tag-resource-request - `com.amazonaws.services.codecommit.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-pull-request-events-async
  "Returns information about one or more pull request events.

  describe-pull-request-events-request - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePullRequestEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest describe-pull-request-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePullRequestEventsAsync describe-pull-request-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest describe-pull-request-events-request]
    (-> this (.describePullRequestEventsAsync describe-pull-request-events-request))))

(defn merge-pull-request-by-squash-async
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.

  merge-pull-request-by-squash-request - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MergePullRequestBySquash operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest merge-pull-request-by-squash-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergePullRequestBySquashAsync merge-pull-request-by-squash-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest merge-pull-request-by-squash-request]
    (-> this (.mergePullRequestBySquashAsync merge-pull-request-by-squash-request))))

(defn get-comment-async
  "Returns the content of a comment made on a change, file, or commit in a repository.

  get-comment-request - `com.amazonaws.services.codecommit.model.GetCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codecommit.model.GetCommentResult>`"
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentRequest get-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCommentAsync get-comment-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeCommitAsync this ^com.amazonaws.services.codecommit.model.GetCommentRequest get-comment-request]
    (-> this (.getCommentAsync get-comment-request))))

