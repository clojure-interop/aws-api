(ns com.amazonaws.services.codecommit.AbstractAWSCodeCommit
  "Abstract implementation of AWSCodeCommit. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codecommit AbstractAWSCodeCommit]))

(defn update-repository-description
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest`

  returns: Result of the UpdateRepositoryDescription operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult`"
  (^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest request]
    (-> this (.updateRepositoryDescription request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codecommit.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.codecommit.model.ListTagsForResourceResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-comments-for-pull-request
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest`

  returns: Result of the GetCommentsForPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult`"
  (^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest request]
    (-> this (.getCommentsForPullRequest request))))

(defn create-commit
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.CreateCommitRequest`

  returns: Result of the CreateCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateCommitResult`"
  (^com.amazonaws.services.codecommit.model.CreateCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateCommitRequest request]
    (-> this (.createCommit request))))

(defn set-region
  "Description copied from interface: AWSCodeCommit

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCodeCommit this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-pull-request
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetPullRequestRequest`

  returns: Result of the GetPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.GetPullRequestResult`"
  (^com.amazonaws.services.codecommit.model.GetPullRequestResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetPullRequestRequest request]
    (-> this (.getPullRequest request))))

(defn post-comment-for-pull-request
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest`

  returns: Result of the PostCommentForPullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult`"
  (^com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest request]
    (-> this (.postCommentForPullRequest request))))

(defn describe-pull-request-events
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest`

  returns: Result of the DescribePullRequestEvents operation returned by the service. - `com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult`"
  (^com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest request]
    (-> this (.describePullRequestEvents request))))

(defn get-repository-triggers
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a get repository triggers operation. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest`

  returns: Result of the GetRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult`"
  (^com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest request]
    (-> this (.getRepositoryTriggers request))))

(defn create-branch
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a create branch operation. - `com.amazonaws.services.codecommit.model.CreateBranchRequest`

  returns: Result of the CreateBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateBranchResult`"
  (^com.amazonaws.services.codecommit.model.CreateBranchResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateBranchRequest request]
    (-> this (.createBranch request))))

(defn untag-resource
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codecommit.model.UntagResourceResult`"
  (^com.amazonaws.services.codecommit.model.UntagResourceResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn batch-get-repositories
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a batch get repositories operation. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest`

  returns: Result of the BatchGetRepositories operation returned by the service. - `com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult`"
  (^com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest request]
    (-> this (.batchGetRepositories request))))

(defn post-comment-for-compared-commit
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest`

  returns: Result of the PostCommentForComparedCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult`"
  (^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest request]
    (-> this (.postCommentForComparedCommit request))))

(defn merge-branches-by-fast-forward
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest`

  returns: Result of the MergeBranchesByFastForward operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult`"
  (^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesByFastForwardRequest request]
    (-> this (.mergeBranchesByFastForward request))))

(defn get-merge-commit
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetMergeCommitRequest`

  returns: Result of the GetMergeCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeCommitResult`"
  (^com.amazonaws.services.codecommit.model.GetMergeCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeCommitRequest request]
    (-> this (.getMergeCommit request))))

(defn update-repository-name
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of an update repository description operation. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest`

  returns: Result of the UpdateRepositoryName operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult`"
  (^com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest request]
    (-> this (.updateRepositoryName request))))

(defn get-repository
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a get repository operation. - `com.amazonaws.services.codecommit.model.GetRepositoryRequest`

  returns: Result of the GetRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.GetRepositoryResult`"
  (^com.amazonaws.services.codecommit.model.GetRepositoryResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetRepositoryRequest request]
    (-> this (.getRepository request))))

(defn batch-describe-merge-conflicts
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest`

  returns: Result of the BatchDescribeMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult`"
  (^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.BatchDescribeMergeConflictsRequest request]
    (-> this (.batchDescribeMergeConflicts request))))

(defn create-repository
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a create repository operation. - `com.amazonaws.services.codecommit.model.CreateRepositoryRequest`

  returns: Result of the CreateRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateRepositoryResult`"
  (^com.amazonaws.services.codecommit.model.CreateRepositoryResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateRepositoryRequest request]
    (-> this (.createRepository request))))

(defn get-branch
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a get branch operation. - `com.amazonaws.services.codecommit.model.GetBranchRequest`

  returns: Result of the GetBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.GetBranchResult`"
  (^com.amazonaws.services.codecommit.model.GetBranchResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetBranchRequest request]
    (-> this (.getBranch request))))

(defn get-merge-options
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetMergeOptionsRequest`

  returns: Result of the GetMergeOptions operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeOptionsResult`"
  (^com.amazonaws.services.codecommit.model.GetMergeOptionsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeOptionsRequest request]
    (-> this (.getMergeOptions request))))

(defn get-differences
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetDifferencesRequest`

  returns: Result of the GetDifferences operation returned by the service. - `com.amazonaws.services.codecommit.model.GetDifferencesResult`"
  (^com.amazonaws.services.codecommit.model.GetDifferencesResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetDifferencesRequest request]
    (-> this (.getDifferences request))))

(defn list-pull-requests
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.ListPullRequestsRequest`

  returns: Result of the ListPullRequests operation returned by the service. - `com.amazonaws.services.codecommit.model.ListPullRequestsResult`"
  (^com.amazonaws.services.codecommit.model.ListPullRequestsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListPullRequestsRequest request]
    (-> this (.listPullRequests request))))

(defn merge-branches-by-three-way
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest`

  returns: Result of the MergeBranchesByThreeWay operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult`"
  (^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesByThreeWayRequest request]
    (-> this (.mergeBranchesByThreeWay request))))

(defn delete-branch
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a delete branch operation. - `com.amazonaws.services.codecommit.model.DeleteBranchRequest`

  returns: Result of the DeleteBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteBranchResult`"
  (^com.amazonaws.services.codecommit.model.DeleteBranchResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteBranchRequest request]
    (-> this (.deleteBranch request))))

(defn post-comment-reply
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.PostCommentReplyRequest`

  returns: Result of the PostCommentReply operation returned by the service. - `com.amazonaws.services.codecommit.model.PostCommentReplyResult`"
  (^com.amazonaws.services.codecommit.model.PostCommentReplyResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.PostCommentReplyRequest request]
    (-> this (.postCommentReply request))))

(defn delete-file
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.DeleteFileRequest`

  returns: Result of the DeleteFile operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteFileResult`"
  (^com.amazonaws.services.codecommit.model.DeleteFileResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteFileRequest request]
    (-> this (.deleteFile request))))

(defn put-file
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.PutFileRequest`

  returns: Result of the PutFile operation returned by the service. - `com.amazonaws.services.codecommit.model.PutFileResult`"
  (^com.amazonaws.services.codecommit.model.PutFileResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.PutFileRequest request]
    (-> this (.putFile request))))

(defn get-blob
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a get blob operation. - `com.amazonaws.services.codecommit.model.GetBlobRequest`

  returns: Result of the GetBlob operation returned by the service. - `com.amazonaws.services.codecommit.model.GetBlobResult`"
  (^com.amazonaws.services.codecommit.model.GetBlobResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetBlobRequest request]
    (-> this (.getBlob request))))

(defn delete-repository
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a delete repository operation. - `com.amazonaws.services.codecommit.model.DeleteRepositoryRequest`

  returns: Result of the DeleteRepository operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteRepositoryResult`"
  (^com.amazonaws.services.codecommit.model.DeleteRepositoryResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteRepositoryRequest request]
    (-> this (.deleteRepository request))))

(defn merge-pull-request-by-three-way
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest`

  returns: Result of the MergePullRequestByThreeWay operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult`"
  (^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestByThreeWayRequest request]
    (-> this (.mergePullRequestByThreeWay request))))

(defn shutdown
  "Description copied from interface: AWSCodeCommit"
  ([^AbstractAWSCodeCommit this]
    (-> this (.shutdown))))

(defn update-comment
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.UpdateCommentRequest`

  returns: Result of the UpdateComment operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateCommentResult`"
  (^com.amazonaws.services.codecommit.model.UpdateCommentResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateCommentRequest request]
    (-> this (.updateComment request))))

(defn get-commit
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a get commit operation. - `com.amazonaws.services.codecommit.model.GetCommitRequest`

  returns: Result of the GetCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommitResult`"
  (^com.amazonaws.services.codecommit.model.GetCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommitRequest request]
    (-> this (.getCommit request))))

(defn update-default-branch
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of an update default branch operation. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest`

  returns: Result of the UpdateDefaultBranch operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult`"
  (^com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest request]
    (-> this (.updateDefaultBranch request))))

(defn set-endpoint
  "Description copied from interface: AWSCodeCommit

  endpoint - The endpoint (ex: \"codecommit.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://codecommit.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCodeCommit this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-comments-for-compared-commit
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest`

  returns: Result of the GetCommentsForComparedCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult`"
  (^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest request]
    (-> this (.getCommentsForComparedCommit request))))

(defn get-folder
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetFolderRequest`

  returns: Result of the GetFolder operation returned by the service. - `com.amazonaws.services.codecommit.model.GetFolderResult`"
  (^com.amazonaws.services.codecommit.model.GetFolderResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetFolderRequest request]
    (-> this (.getFolder request))))

(defn test-repository-triggers
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a test repository triggers operation. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest`

  returns: Result of the TestRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult`"
  (^com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest request]
    (-> this (.testRepositoryTriggers request))))

(defn update-pull-request-description
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest`

  returns: Result of the UpdatePullRequestDescription operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult`"
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest request]
    (-> this (.updatePullRequestDescription request))))

(defn update-pull-request-title
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest`

  returns: Result of the UpdatePullRequestTitle operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult`"
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest request]
    (-> this (.updatePullRequestTitle request))))

(defn put-repository-triggers
  "Description copied from interface: AWSCodeCommit

  request - Represents the input ofa put repository triggers operation. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest`

  returns: Result of the PutRepositoryTriggers operation returned by the service. - `com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult`"
  (^com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest request]
    (-> this (.putRepositoryTriggers request))))

(defn get-comment
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetCommentRequest`

  returns: Result of the GetComment operation returned by the service. - `com.amazonaws.services.codecommit.model.GetCommentResult`"
  (^com.amazonaws.services.codecommit.model.GetCommentResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetCommentRequest request]
    (-> this (.getComment request))))

(defn get-merge-conflicts
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetMergeConflictsRequest`

  returns: Result of the GetMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.GetMergeConflictsResult`"
  (^com.amazonaws.services.codecommit.model.GetMergeConflictsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetMergeConflictsRequest request]
    (-> this (.getMergeConflicts request))))

(defn delete-comment-content
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.DeleteCommentContentRequest`

  returns: Result of the DeleteCommentContent operation returned by the service. - `com.amazonaws.services.codecommit.model.DeleteCommentContentResult`"
  (^com.amazonaws.services.codecommit.model.DeleteCommentContentResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DeleteCommentContentRequest request]
    (-> this (.deleteCommentContent request))))

(defn get-file
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.GetFileRequest`

  returns: Result of the GetFile operation returned by the service. - `com.amazonaws.services.codecommit.model.GetFileResult`"
  (^com.amazonaws.services.codecommit.model.GetFileResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.GetFileRequest request]
    (-> this (.getFile request))))

(defn list-repositories
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a list repositories operation. - `com.amazonaws.services.codecommit.model.ListRepositoriesRequest`

  returns: Result of the ListRepositories operation returned by the service. - `com.amazonaws.services.codecommit.model.ListRepositoriesResult`"
  (^com.amazonaws.services.codecommit.model.ListRepositoriesResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListRepositoriesRequest request]
    (-> this (.listRepositories request))))

(defn list-branches
  "Description copied from interface: AWSCodeCommit

  request - Represents the input of a list branches operation. - `com.amazonaws.services.codecommit.model.ListBranchesRequest`

  returns: Result of the ListBranches operation returned by the service. - `com.amazonaws.services.codecommit.model.ListBranchesResult`"
  (^com.amazonaws.services.codecommit.model.ListBranchesResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.ListBranchesRequest request]
    (-> this (.listBranches request))))

(defn create-pull-request
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.CreatePullRequestRequest`

  returns: Result of the CreatePullRequest operation returned by the service. - `com.amazonaws.services.codecommit.model.CreatePullRequestResult`"
  (^com.amazonaws.services.codecommit.model.CreatePullRequestResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreatePullRequestRequest request]
    (-> this (.createPullRequest request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCodeCommit

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCodeCommit this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn merge-pull-request-by-squash
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest`

  returns: Result of the MergePullRequestBySquash operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult`"
  (^com.amazonaws.services.codecommit.model.MergePullRequestBySquashResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestBySquashRequest request]
    (-> this (.mergePullRequestBySquash request))))

(defn merge-branches-by-squash
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest`

  returns: Result of the MergeBranchesBySquash operation returned by the service. - `com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult`"
  (^com.amazonaws.services.codecommit.model.MergeBranchesBySquashResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergeBranchesBySquashRequest request]
    (-> this (.mergeBranchesBySquash request))))

(defn tag-resource
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codecommit.model.TagResourceResult`"
  (^com.amazonaws.services.codecommit.model.TagResourceResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-merge-conflicts
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest`

  returns: Result of the DescribeMergeConflicts operation returned by the service. - `com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult`"
  (^com.amazonaws.services.codecommit.model.DescribeMergeConflictsResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.DescribeMergeConflictsRequest request]
    (-> this (.describeMergeConflicts request))))

(defn merge-pull-request-by-fast-forward
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest`

  returns: Result of the MergePullRequestByFastForward operation returned by the service. - `com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult`"
  (^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest request]
    (-> this (.mergePullRequestByFastForward request))))

(defn create-unreferenced-merge-commit
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest`

  returns: Result of the CreateUnreferencedMergeCommit operation returned by the service. - `com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult`"
  (^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.CreateUnreferencedMergeCommitRequest request]
    (-> this (.createUnreferencedMergeCommit request))))

(defn update-pull-request-status
  "Description copied from interface: AWSCodeCommit

  request - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest`

  returns: Result of the UpdatePullRequestStatus operation returned by the service. - `com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult`"
  (^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult [^AbstractAWSCodeCommit this ^com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest request]
    (-> this (.updatePullRequestStatus request))))

