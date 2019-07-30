(ns com.amazonaws.services.codecommit.AWSCodeCommit
  "Interface for accessing CodeCommit.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeCommit instead.


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
  (:import [com.amazonaws.services.codecommit AWSCodeCommit]))

(defn update-repository-description
  "Sets or changes the comment or description for a repository.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  update-repository-description-request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest`

  returns: Result of the UpdateRepositoryDescription operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult`

  throws: com.amazonaws.services.codecommit.model.InvalidRepositoryDescriptionException - The specified repository description is not valid."
  (^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest update-repository-description-request]
    (-> this (.updateRepositoryDescription update-repository-description-request))))

(defn list-tags-for-resource
  "Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
   resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  list-tags-for-resource-request - `com.amazonaws.services.codecommit.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codecommit.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryDoesNotExistException - The specified repository does not exist."
  (^com.amazonaws.services.codecommit.model.ListTagsForResourceResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-comments-for-pull-request
  "Returns comments made on a pull request.

  get-comments-for-pull-request-request - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest`

  returns: Result of the GetCommentsForPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult`

  throws: com.amazonaws.services.codecommit.model.InvalidContinuationTokenException - The specified continuation token is not valid."
  (^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest get-comments-for-pull-request-request]
    (-> this (.getCommentsForPullRequest get-comments-for-pull-request-request))))

(defn create-commit
  "Creates a commit for a repository on the tip of a specified branch.

  create-commit-request - `com.amazonaws.services.codecommit.model.CreateCommitRequest`

  returns: Result of the CreateCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateCommitResult`

  throws: com.amazonaws.services.codecommit.model.ParentCommitIdRequiredException - A parent commit ID is required. To view the full commit ID of a branch in a repository, use GetBranch or a Git command (for example, git pull or git log)."
  (^com.amazonaws.services.codecommit.model.CreateCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateCommitRequest create-commit-request]
    (-> this (.createCommit create-commit-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCodeCommit this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-pull-request
  "Gets information about a pull request in a specified repository.

  get-pull-request-request - `com.amazonaws.services.codecommit.model.GetPullRequestRequest`

  returns: Result of the GetPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.GetPullRequestResult`

  throws: com.amazonaws.services.codecommit.model.PullRequestDoesNotExistException - The pull request ID could not be found. Make sure that you have specified the correct repository name and pull request ID, and then try again."
  (^com.amazonaws.services.codecommit.model.GetPullRequestResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest get-pull-request-request]
    (-> this (.getPullRequest get-pull-request-request))))

(defn post-comment-for-pull-request
  "Posts a comment on a pull request.

  post-comment-for-pull-request-request - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest`

  returns: Result of the PostCommentForPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult`

  throws: com.amazonaws.services.codecommit.model.InvalidRelativeFileVersionEnumException - Either the enum is not in a valid format, or the specified file version enum is not valid in respect to the current file version."
  (^com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest post-comment-for-pull-request-request]
    (-> this (.postCommentForPullRequest post-comment-for-pull-request-request))))

(defn describe-pull-request-events
  "Returns information about one or more pull request events.

  describe-pull-request-events-request - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest`

  returns: Result of the DescribePullRequestEvents operation returned by the service. - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult`

  throws: com.amazonaws.services.codecommit.model.ActorDoesNotExistException - The specified Amazon Resource Name (ARN) does not exist in the AWS account."
  (^com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest describe-pull-request-events-request]
    (-> this (.describePullRequestEvents describe-pull-request-events-request))))

(defn get-repository-triggers
  "Gets information about triggers configured for a repository.

  get-repository-triggers-request - Represents the input of a get repository triggers operation. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest`

  returns: Result of the GetRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryNameRequiredException - A repository name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest get-repository-triggers-request]
    (-> this (.getRepositoryTriggers get-repository-triggers-request))))

(defn create-branch
  "Creates a new branch in a repository and points the branch to a commit.



   Calling the create branch operation does not set a repository's default branch. To do this, call the update
   default branch operation.

  create-branch-request - Represents the input of a create branch operation. - `com.amazonaws.services.codecommit.model.CreateBranchRequest`

  returns: Result of the CreateBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateBranchResult`

  throws: com.amazonaws.services.codecommit.model.BranchNameRequiredException - A branch name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.CreateBranchResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateBranchRequest create-branch-request]
    (-> this (.createBranch create-branch-request))))

(defn untag-resource
  "Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  untag-resource-request - `com.amazonaws.services.codecommit.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codecommit.model.UntagResourceResult`

  throws: com.amazonaws.services.codecommit.model.InvalidTagKeysListException - The list of tags is not valid."
  (^com.amazonaws.services.codecommit.model.UntagResourceResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn batch-get-repositories
  "Returns information about one or more repositories.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  batch-get-repositories-request - Represents the input of a batch get repositories operation. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest`

  returns: Result of the BatchGetRepositories operation returned by the service. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryNamesRequiredException - A repository names object is required but was not specified."
  (^com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest batch-get-repositories-request]
    (-> this (.batchGetRepositories batch-get-repositories-request))))

(defn post-comment-for-compared-commit
  "Posts a comment on the comparison between two commits.

  post-comment-for-compared-commit-request - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest`

  returns: Result of the PostCommentForComparedCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult`

  throws: com.amazonaws.services.codecommit.model.InvalidRelativeFileVersionEnumException - Either the enum is not in a valid format, or the specified file version enum is not valid in respect to the current file version."
  (^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest post-comment-for-compared-commit-request]
    (-> this (.postCommentForComparedCommit post-comment-for-compared-commit-request))))

(defn merge-branches-by-fast-forward
  "Merges two branches using the fast-forward merge strategy.

  merge-branches-by-fast-forward-request - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest`

  returns: Result of the MergeBranchesByFastForward operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest merge-branches-by-fast-forward-request]
    (-> this (.mergeBranchesByFastForward merge-branches-by-fast-forward-request))))

(defn get-merge-commit
  "Returns information about a specified merge commit.

  get-merge-commit-request - `com.amazonaws.services.codecommit.model.GetMergeCommitRequest`

  returns: Result of the GetMergeCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeCommitResult`

  throws: com.amazonaws.services.codecommit.model.InvalidConflictDetailLevelException - The specified conflict detail level is not valid."
  (^com.amazonaws.services.codecommit.model.GetMergeCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest get-merge-commit-request]
    (-> this (.getMergeCommit get-merge-commit-request))))

(defn update-repository-name
  "Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
   names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
   The suffix \".git\" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User
   Guide.

  update-repository-name-request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest`

  returns: Result of the UpdateRepositoryName operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryDoesNotExistException - The specified repository does not exist."
  (^com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest update-repository-name-request]
    (-> this (.updateRepositoryName update-repository-name-request))))

(defn get-repository
  "Returns information about a repository.



   The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
   that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
   code. Make sure that you HTML-encode the description field in any application that uses this API to display the
   repository description on a web page.

  get-repository-request - Represents the input of a get repository operation. - `com.amazonaws.services.codecommit.model.GetRepositoryRequest`

  returns: Result of the GetRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.GetRepositoryResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryNameRequiredException - A repository name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.GetRepositoryResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest get-repository-request]
    (-> this (.getRepository get-repository-request))))

(defn batch-describe-merge-conflicts
  "Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
   squash or three-way merge strategy.

  batch-describe-merge-conflicts-request - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest`

  returns: Result of the BatchDescribeMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult`

  throws: com.amazonaws.services.codecommit.model.InvalidConflictDetailLevelException - The specified conflict detail level is not valid."
  (^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest batch-describe-merge-conflicts-request]
    (-> this (.batchDescribeMergeConflicts batch-describe-merge-conflicts-request))))

(defn create-repository
  "Creates a new, empty repository.

  create-repository-request - Represents the input of a create repository operation. - `com.amazonaws.services.codecommit.model.CreateRepositoryRequest`

  returns: Result of the CreateRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateRepositoryResult`

  throws: com.amazonaws.services.codecommit.model.InvalidRepositoryDescriptionException - The specified repository description is not valid."
  (^com.amazonaws.services.codecommit.model.CreateRepositoryResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest create-repository-request]
    (-> this (.createRepository create-repository-request))))

(defn get-branch
  "Returns information about a repository branch, including its name and the last commit ID.

  get-branch-request - Represents the input of a get branch operation. - `com.amazonaws.services.codecommit.model.GetBranchRequest`

  returns: Result of the GetBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.GetBranchResult`

  throws: com.amazonaws.services.codecommit.model.BranchNameRequiredException - A branch name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.GetBranchResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetBranchRequest get-branch-request]
    (-> this (.getBranch get-branch-request))))

(defn get-merge-options
  "Returns information about the merge options available for merging two specified branches. For details about why a
   particular merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.

  get-merge-options-request - `com.amazonaws.services.codecommit.model.GetMergeOptionsRequest`

  returns: Result of the GetMergeOptions operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeOptionsResult`

  throws: com.amazonaws.services.codecommit.model.InvalidConflictDetailLevelException - The specified conflict detail level is not valid."
  (^com.amazonaws.services.codecommit.model.GetMergeOptionsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest get-merge-options-request]
    (-> this (.getMergeOptions get-merge-options-request))))

(defn get-differences
  "Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
   other fully qualified reference). Results can be limited to a specified path.

  get-differences-request - `com.amazonaws.services.codecommit.model.GetDifferencesRequest`

  returns: Result of the GetDifferences operation returned by the service. - `com.amazonaws.services.codecommit.model.GetDifferencesResult`

  throws: com.amazonaws.services.codecommit.model.InvalidContinuationTokenException - The specified continuation token is not valid."
  (^com.amazonaws.services.codecommit.model.GetDifferencesResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest get-differences-request]
    (-> this (.getDifferences get-differences-request))))

(defn list-pull-requests
  "Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
   or pull request author ARN.

  list-pull-requests-request - `com.amazonaws.services.codecommit.model.ListPullRequestsRequest`

  returns: Result of the ListPullRequests operation returned by the service. - `com.amazonaws.services.codecommit.model.ListPullRequestsResult`

  throws: com.amazonaws.services.codecommit.model.InvalidContinuationTokenException - The specified continuation token is not valid."
  (^com.amazonaws.services.codecommit.model.ListPullRequestsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest list-pull-requests-request]
    (-> this (.listPullRequests list-pull-requests-request))))

(defn merge-branches-by-three-way
  "Merges two specified branches using the three-way merge strategy.

  merge-branches-by-three-way-request - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest`

  returns: Result of the MergeBranchesByThreeWay operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest merge-branches-by-three-way-request]
    (-> this (.mergeBranchesByThreeWay merge-branches-by-three-way-request))))

(defn delete-branch
  "Deletes a branch from a repository, unless that branch is the default branch for the repository.

  delete-branch-request - Represents the input of a delete branch operation. - `com.amazonaws.services.codecommit.model.DeleteBranchRequest`

  returns: Result of the DeleteBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteBranchResult`

  throws: com.amazonaws.services.codecommit.model.BranchNameRequiredException - A branch name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.DeleteBranchResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest delete-branch-request]
    (-> this (.deleteBranch delete-branch-request))))

(defn post-comment-reply
  "Posts a comment in reply to an existing comment on a comparison between commits or a pull request.

  post-comment-reply-request - `com.amazonaws.services.codecommit.model.PostCommentReplyRequest`

  returns: Result of the PostCommentReply operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentReplyResult`

  throws: com.amazonaws.services.codecommit.model.ClientRequestTokenRequiredException - A client request token is required. A client request token is an unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token."
  (^com.amazonaws.services.codecommit.model.PostCommentReplyResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest post-comment-reply-request]
    (-> this (.postCommentReply post-comment-reply-request))))

(defn delete-file
  "Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
   The file will still exist in the commits prior to the commit that contains the deletion.

  delete-file-request - `com.amazonaws.services.codecommit.model.DeleteFileRequest`

  returns: Result of the DeleteFile operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteFileResult`

  throws: com.amazonaws.services.codecommit.model.ParentCommitIdRequiredException - A parent commit ID is required. To view the full commit ID of a branch in a repository, use GetBranch or a Git command (for example, git pull or git log)."
  (^com.amazonaws.services.codecommit.model.DeleteFileResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteFileRequest delete-file-request]
    (-> this (.deleteFile delete-file-request))))

(defn put-file
  "Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
   the specified branch.

  put-file-request - `com.amazonaws.services.codecommit.model.PutFileRequest`

  returns: Result of the PutFile operation returned by the service. - `com.amazonaws.services.codecommit.model.PutFileResult`

  throws: com.amazonaws.services.codecommit.model.ParentCommitIdRequiredException - A parent commit ID is required. To view the full commit ID of a branch in a repository, use GetBranch or a Git command (for example, git pull or git log)."
  (^com.amazonaws.services.codecommit.model.PutFileResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.PutFileRequest put-file-request]
    (-> this (.putFile put-file-request))))

(defn get-blob
  "Returns the base-64 encoded content of an individual blob within a repository.

  get-blob-request - Represents the input of a get blob operation. - `com.amazonaws.services.codecommit.model.GetBlobRequest`

  returns: Result of the GetBlob operation returned by the service. - `com.amazonaws.services.codecommit.model.GetBlobResult`

  throws: com.amazonaws.services.codecommit.model.FileTooLargeException - The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in AWS CodeCommit, see AWS CodeCommit User Guide."
  (^com.amazonaws.services.codecommit.model.GetBlobResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetBlobRequest get-blob-request]
    (-> this (.getBlob get-blob-request))))

(defn delete-repository
  "Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.



   Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
   push calls to the deleted repository will fail.

  delete-repository-request - Represents the input of a delete repository operation. - `com.amazonaws.services.codecommit.model.DeleteRepositoryRequest`

  returns: Result of the DeleteRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteRepositoryResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryNameRequiredException - A repository name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.DeleteRepositoryResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest delete-repository-request]
    (-> this (.deleteRepository delete-repository-request))))

(defn merge-pull-request-by-three-way
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
   request.

  merge-pull-request-by-three-way-request - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest`

  returns: Result of the MergePullRequestByThreeWay operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest merge-pull-request-by-three-way-request]
    (-> this (.mergePullRequestByThreeWay merge-pull-request-by-three-way-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCodeCommit this]
    (-> this (.shutdown))))

(defn update-comment
  "Replaces the contents of a comment.

  update-comment-request - `com.amazonaws.services.codecommit.model.UpdateCommentRequest`

  returns: Result of the UpdateComment operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateCommentResult`

  throws: com.amazonaws.services.codecommit.model.CommentContentRequiredException - The comment is empty. You must provide some content for a comment. The content cannot be null."
  (^com.amazonaws.services.codecommit.model.UpdateCommentResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest update-comment-request]
    (-> this (.updateComment update-comment-request))))

(defn get-commit
  "Returns information about a commit, including commit message and committer information.

  get-commit-request - Represents the input of a get commit operation. - `com.amazonaws.services.codecommit.model.GetCommitRequest`

  returns: Result of the GetCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommitResult`

  throws: com.amazonaws.services.codecommit.model.InvalidCommitIdException - The specified commit ID is not valid."
  (^com.amazonaws.services.codecommit.model.GetCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommitRequest get-commit-request]
    (-> this (.getCommit get-commit-request))))

(defn update-default-branch
  "Sets or changes the default branch name for the specified repository.



   If you use this operation to change the default branch name to the current default branch name, a success message
   is returned even though the default branch did not change.

  update-default-branch-request - Represents the input of an update default branch operation. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest`

  returns: Result of the UpdateDefaultBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult`

  throws: com.amazonaws.services.codecommit.model.BranchNameRequiredException - A branch name is required but was not specified."
  (^com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest update-default-branch-request]
    (-> this (.updateDefaultBranch update-default-branch-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"codecommit.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://codecommit.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCodeCommit this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-comments-for-compared-commit
  "Returns information about comments made on the comparison between two commits.

  get-comments-for-compared-commit-request - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest`

  returns: Result of the GetCommentsForComparedCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult`

  throws: com.amazonaws.services.codecommit.model.InvalidContinuationTokenException - The specified continuation token is not valid."
  (^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest get-comments-for-compared-commit-request]
    (-> this (.getCommentsForComparedCommit get-comments-for-compared-commit-request))))

(defn get-folder
  "Returns the contents of a specified folder in a repository.

  get-folder-request - `com.amazonaws.services.codecommit.model.GetFolderRequest`

  returns: Result of the GetFolder operation returned by the service. - `com.amazonaws.services.codecommit.model.GetFolderResult`

  throws: com.amazonaws.services.codecommit.model.EncryptionKeyAccessDeniedException - An encryption key could not be accessed."
  (^com.amazonaws.services.codecommit.model.GetFolderResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetFolderRequest get-folder-request]
    (-> this (.getFolder get-folder-request))))

(defn test-repository-triggers
  "Tests the functionality of repository triggers by sending information to the trigger target. If real data is
   available in the repository, the test will send data from the last commit. If no data is available, sample data
   will be generated.

  test-repository-triggers-request - Represents the input of a test repository triggers operation. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest`

  returns: Result of the TestRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryTriggersListRequiredException - The list of triggers for the repository is required but was not specified."
  (^com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest test-repository-triggers-request]
    (-> this (.testRepositoryTriggers test-repository-triggers-request))))

(defn update-pull-request-description
  "Replaces the contents of the description of a pull request.

  update-pull-request-description-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest`

  returns: Result of the UpdatePullRequestDescription operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult`

  throws: com.amazonaws.services.codecommit.model.PullRequestDoesNotExistException - The pull request ID could not be found. Make sure that you have specified the correct repository name and pull request ID, and then try again."
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest update-pull-request-description-request]
    (-> this (.updatePullRequestDescription update-pull-request-description-request))))

(defn update-pull-request-title
  "Replaces the title of a pull request.

  update-pull-request-title-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest`

  returns: Result of the UpdatePullRequestTitle operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult`

  throws: com.amazonaws.services.codecommit.model.PullRequestDoesNotExistException - The pull request ID could not be found. Make sure that you have specified the correct repository name and pull request ID, and then try again."
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest update-pull-request-title-request]
    (-> this (.updatePullRequestTitle update-pull-request-title-request))))

(defn put-repository-triggers
  "Replaces all triggers for a repository. This can be used to create or delete triggers.

  put-repository-triggers-request - Represents the input ofa put repository triggers operation. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest`

  returns: Result of the PutRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult`

  throws: com.amazonaws.services.codecommit.model.RepositoryTriggersListRequiredException - The list of triggers for the repository is required but was not specified."
  (^com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest put-repository-triggers-request]
    (-> this (.putRepositoryTriggers put-repository-triggers-request))))

(defn get-comment
  "Returns the content of a comment made on a change, file, or commit in a repository.

  get-comment-request - `com.amazonaws.services.codecommit.model.GetCommentRequest`

  returns: Result of the GetComment operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentResult`

  throws: com.amazonaws.services.codecommit.model.CommentDoesNotExistException - No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again."
  (^com.amazonaws.services.codecommit.model.GetCommentResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentRequest get-comment-request]
    (-> this (.getComment get-comment-request))))

(defn get-merge-conflicts
  "Returns information about merge conflicts between the before and after commit IDs for a pull request in a
   repository.

  get-merge-conflicts-request - `com.amazonaws.services.codecommit.model.GetMergeConflictsRequest`

  returns: Result of the GetMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeConflictsResult`

  throws: com.amazonaws.services.codecommit.model.InvalidDestinationCommitSpecifierException - The destination commit specifier is not valid. You must provide a valid branch name, tag, or full commit ID."
  (^com.amazonaws.services.codecommit.model.GetMergeConflictsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest get-merge-conflicts-request]
    (-> this (.getMergeConflicts get-merge-conflicts-request))))

(defn delete-comment-content
  "Deletes the content of a comment made on a change, file, or commit in a repository.

  delete-comment-content-request - `com.amazonaws.services.codecommit.model.DeleteCommentContentRequest`

  returns: Result of the DeleteCommentContent operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteCommentContentResult`

  throws: com.amazonaws.services.codecommit.model.CommentDoesNotExistException - No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again."
  (^com.amazonaws.services.codecommit.model.DeleteCommentContentResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest delete-comment-content-request]
    (-> this (.deleteCommentContent delete-comment-content-request))))

(defn get-file
  "Returns the base-64 encoded contents of a specified file and its metadata.

  get-file-request - `com.amazonaws.services.codecommit.model.GetFileRequest`

  returns: Result of the GetFile operation returned by the service. - `com.amazonaws.services.codecommit.model.GetFileResult`

  throws: com.amazonaws.services.codecommit.model.FileTooLargeException - The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in AWS CodeCommit, see AWS CodeCommit User Guide."
  (^com.amazonaws.services.codecommit.model.GetFileResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetFileRequest get-file-request]
    (-> this (.getFile get-file-request))))

(defn list-repositories
  "Gets information about one or more repositories.

  list-repositories-request - Represents the input of a list repositories operation. - `com.amazonaws.services.codecommit.model.ListRepositoriesRequest`

  returns: Result of the ListRepositories operation returned by the service. - `com.amazonaws.services.codecommit.model.ListRepositoriesResult`

  throws: com.amazonaws.services.codecommit.model.InvalidSortByException - The specified sort by value is not valid."
  (^com.amazonaws.services.codecommit.model.ListRepositoriesResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest list-repositories-request]
    (-> this (.listRepositories list-repositories-request))))

(defn list-branches
  "Gets information about one or more branches in a repository.

  list-branches-request - Represents the input of a list branches operation. - `com.amazonaws.services.codecommit.model.ListBranchesRequest`

  returns: Result of the ListBranches operation returned by the service. - `com.amazonaws.services.codecommit.model.ListBranchesResult`

  throws: com.amazonaws.services.codecommit.model.InvalidContinuationTokenException - The specified continuation token is not valid."
  (^com.amazonaws.services.codecommit.model.ListBranchesResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListBranchesRequest list-branches-request]
    (-> this (.listBranches list-branches-request))))

(defn create-pull-request
  "Creates a pull request in the specified repository.

  create-pull-request-request - `com.amazonaws.services.codecommit.model.CreatePullRequestRequest`

  returns: Result of the CreatePullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.CreatePullRequestResult`

  throws: com.amazonaws.services.codecommit.model.IdempotencyParameterMismatchException - The client request token is not valid. Either the token is not in a valid format, or the token has been used in a previous request and cannot be re-used."
  (^com.amazonaws.services.codecommit.model.CreatePullRequestResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest create-pull-request-request]
    (-> this (.createPullRequest create-pull-request-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodeCommit this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn merge-pull-request-by-squash
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.

  merge-pull-request-by-squash-request - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest`

  returns: Result of the MergePullRequestBySquash operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest merge-pull-request-by-squash-request]
    (-> this (.mergePullRequestBySquash merge-pull-request-by-squash-request))))

(defn merge-branches-by-squash
  "Merges two branches using the squash merge strategy.

  merge-branches-by-squash-request - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest`

  returns: Result of the MergeBranchesBySquash operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest merge-branches-by-squash-request]
    (-> this (.mergeBranchesBySquash merge-branches-by-squash-request))))

(defn tag-resource
  "Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.

  tag-resource-request - `com.amazonaws.services.codecommit.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codecommit.model.TagResourceResult`

  throws: com.amazonaws.services.codecommit.model.TagPolicyException - The tag policy is not valid."
  (^com.amazonaws.services.codecommit.model.TagResourceResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn describe-merge-conflicts
  "Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
   squash or three-way merge strategy. If the merge option for the attempted merge is specified as
   FAST_FORWARD_MERGE, an exception will be thrown.

  describe-merge-conflicts-request - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest`

  returns: Result of the DescribeMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult`

  throws: com.amazonaws.services.codecommit.model.InvalidConflictDetailLevelException - The specified conflict detail level is not valid."
  (^com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest describe-merge-conflicts-request]
    (-> this (.describeMergeConflicts describe-merge-conflicts-request))))

(defn merge-pull-request-by-fast-forward
  "Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
   at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
   request.

  merge-pull-request-by-fast-forward-request - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest`

  returns: Result of the MergePullRequestByFastForward operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest merge-pull-request-by-fast-forward-request]
    (-> this (.mergePullRequestByFastForward merge-pull-request-by-fast-forward-request))))

(defn create-unreferenced-merge-commit
  "Creates an unreferenced commit that represents the result of merging two branches using a specified merge
   strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
   fast-forward merge strategy, as that strategy does not create a merge commit.



   This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
   fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.

  create-unreferenced-merge-commit-request - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest`

  returns: Result of the CreateUnreferencedMergeCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult`

  throws: com.amazonaws.services.codecommit.model.ConcurrentReferenceUpdateException - The merge cannot be completed because the target branch has been modified. Another user might have modified the target branch while the merge was in progress. Wait a few minutes, and then try again."
  (^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest create-unreferenced-merge-commit-request]
    (-> this (.createUnreferencedMergeCommit create-unreferenced-merge-commit-request))))

(defn update-pull-request-status
  "Updates the status of a pull request.

  update-pull-request-status-request - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest`

  returns: Result of the UpdatePullRequestStatus operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult`

  throws: com.amazonaws.services.codecommit.model.EncryptionKeyAccessDeniedException - An encryption key could not be accessed."
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult [^AWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest update-pull-request-status-request]
    (-> this (.updatePullRequestStatus update-pull-request-status-request))))

