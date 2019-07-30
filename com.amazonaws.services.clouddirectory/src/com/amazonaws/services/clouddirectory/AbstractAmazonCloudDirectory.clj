(ns com.amazonaws.services.clouddirectory.AbstractAmazonCloudDirectory
  "Abstract implementation of AmazonCloudDirectory. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.clouddirectory AbstractAmazonCloudDirectory]))

(defn list-object-children
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest`

  returns: Result of the ListObjectChildren operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult`"
  (^com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest request]
    (-> this (.listObjectChildren request))))

(defn list-policy-attachments
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest`

  returns: Result of the ListPolicyAttachments operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest request]
    (-> this (.listPolicyAttachments request))))

(defn create-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateObjectRequest`

  returns: Result of the CreateObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest request]
    (-> this (.createObject request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetFacetRequest`

  returns: Result of the GetFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.GetFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest request]
    (-> this (.getFacet request))))

(defn list-typed-link-facet-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest`

  returns: Result of the ListTypedLinkFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest request]
    (-> this (.listTypedLinkFacetAttributes request))))

(defn detach-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DetachObjectRequest`

  returns: Result of the DetachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.DetachObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest request]
    (-> this (.detachObject request))))

(defn list-index
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListIndexRequest`

  returns: Result of the ListIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIndexResult`"
  (^com.amazonaws.services.clouddirectory.model.ListIndexResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest request]
    (-> this (.listIndex request))))

(defn list-object-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest`

  returns: Result of the ListObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest request]
    (-> this (.listObjectAttributes request))))

(defn set-region
  "Description copied from interface: AmazonCloudDirectory

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudDirectory this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn detach-from-index
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest`

  returns: Result of the DetachFromIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachFromIndexResult`"
  (^com.amazonaws.services.clouddirectory.model.DetachFromIndexResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest request]
    (-> this (.detachFromIndex request))))

(defn list-object-parent-paths
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest`

  returns: Result of the ListObjectParentPaths operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest request]
    (-> this (.listObjectParentPaths request))))

(defn list-published-schema-arns
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest`

  returns: Result of the ListPublishedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest request]
    (-> this (.listPublishedSchemaArns request))))

(defn attach-to-index
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.AttachToIndexRequest`

  returns: Result of the AttachToIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachToIndexResult`"
  (^com.amazonaws.services.clouddirectory.model.AttachToIndexResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest request]
    (-> this (.attachToIndex request))))

(defn delete-directory
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult`"
  (^com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectory request))))

(defn lookup-policy
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.LookupPolicyRequest`

  returns: Result of the LookupPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.LookupPolicyResult`"
  (^com.amazonaws.services.clouddirectory.model.LookupPolicyResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest request]
    (-> this (.lookupPolicy request))))

(defn publish-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.PublishSchemaRequest`

  returns: Result of the PublishSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PublishSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.PublishSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest request]
    (-> this (.publishSchema request))))

(defn delete-typed-link-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest`

  returns: Result of the DeleteTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest request]
    (-> this (.deleteTypedLinkFacet request))))

(defn attach-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.AttachObjectRequest`

  returns: Result of the AttachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.AttachObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest request]
    (-> this (.attachObject request))))

(defn untag-resource
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UntagResourceResult`"
  (^com.amazonaws.services.clouddirectory.model.UntagResourceResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn upgrade-applied-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest`

  returns: Result of the UpgradeAppliedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest request]
    (-> this (.upgradeAppliedSchema request))))

(defn get-applied-schema-version
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest`

  returns: Result of the GetAppliedSchemaVersion operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult`"
  (^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest request]
    (-> this (.getAppliedSchemaVersion request))))

(defn create-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateFacetRequest`

  returns: Result of the CreateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest request]
    (-> this (.createFacet request))))

(defn list-typed-link-facet-names
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest`

  returns: Result of the ListTypedLinkFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest request]
    (-> this (.listTypedLinkFacetNames request))))

(defn list-outgoing-typed-links
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest`

  returns: Result of the ListOutgoingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult`"
  (^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest request]
    (-> this (.listOutgoingTypedLinks request))))

(defn get-object-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest`

  returns: Result of the GetObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest request]
    (-> this (.getObjectAttributes request))))

(defn detach-typed-link
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest`

  returns: Result of the DetachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult`"
  (^com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest request]
    (-> this (.detachTypedLink request))))

(defn list-attached-indices
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest`

  returns: Result of the ListAttachedIndices operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest request]
    (-> this (.listAttachedIndices request))))

(defn list-facet-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest`

  returns: Result of the ListFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest request]
    (-> this (.listFacetAttributes request))))

(defn list-facet-names
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest`

  returns: Result of the ListFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetNamesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListFacetNamesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest request]
    (-> this (.listFacetNames request))))

(defn batch-read
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.BatchReadRequest`

  returns: Result of the BatchRead operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchReadResult`"
  (^com.amazonaws.services.clouddirectory.model.BatchReadResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest request]
    (-> this (.batchRead request))))

(defn update-typed-link-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest`

  returns: Result of the UpdateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest request]
    (-> this (.updateTypedLinkFacet request))))

(defn update-object-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest`

  returns: Result of the UpdateObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest request]
    (-> this (.updateObjectAttributes request))))

(defn list-object-policies
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest`

  returns: Result of the ListObjectPolicies operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest request]
    (-> this (.listObjectPolicies request))))

(defn shutdown
  "Description copied from interface: AmazonCloudDirectory"
  ([^AbstractAmazonCloudDirectory this]
    (-> this (.shutdown))))

(defn update-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest`

  returns: Result of the UpdateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.UpdateSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest request]
    (-> this (.updateSchema request))))

(defn add-facet-to-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest`

  returns: Result of the AddFacetToObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest request]
    (-> this (.addFacetToObject request))))

(defn attach-policy
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachPolicyResult`"
  (^com.amazonaws.services.clouddirectory.model.AttachPolicyResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn list-development-schema-arns
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest`

  returns: Result of the ListDevelopmentSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest request]
    (-> this (.listDevelopmentSchemaArns request))))

(defn batch-write
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.BatchWriteRequest`

  returns: Result of the BatchWrite operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchWriteResult`"
  (^com.amazonaws.services.clouddirectory.model.BatchWriteResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest request]
    (-> this (.batchWrite request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudDirectory

  endpoint - The endpoint (ex: \"clouddirectory.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"clouddirectory.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudDirectory this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-facet-from-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest`

  returns: Result of the RemoveFacetFromObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest request]
    (-> this (.removeFacetFromObject request))))

(defn delete-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DeleteFacetRequest`

  returns: Result of the DeleteFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.DeleteFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest request]
    (-> this (.deleteFacet request))))

(defn enable-directory
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest`

  returns: Result of the EnableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.EnableDirectoryResult`"
  (^com.amazonaws.services.clouddirectory.model.EnableDirectoryResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest request]
    (-> this (.enableDirectory request))))

(defn update-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpdateFacetRequest`

  returns: Result of the UpdateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.UpdateFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest request]
    (-> this (.updateFacet request))))

(defn list-object-parents
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest`

  returns: Result of the ListObjectParents operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest request]
    (-> this (.listObjectParents request))))

(defn detach-policy
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachPolicyResult`"
  (^com.amazonaws.services.clouddirectory.model.DetachPolicyResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn get-typed-link-facet-information
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest`

  returns: Result of the GetTypedLinkFacetInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult`"
  (^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest request]
    (-> this (.getTypedLinkFacetInformation request))))

(defn create-index
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateIndexRequest`

  returns: Result of the CreateIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateIndexResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateIndexResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest request]
    (-> this (.createIndex request))))

(defn list-incoming-typed-links
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest`

  returns: Result of the ListIncomingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult`"
  (^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest request]
    (-> this (.listIncomingTypedLinks request))))

(defn apply-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ApplySchemaRequest`

  returns: Result of the ApplySchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ApplySchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.ApplySchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest request]
    (-> this (.applySchema request))))

(defn create-typed-link-facet
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest`

  returns: Result of the CreateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest request]
    (-> this (.createTypedLinkFacet request))))

(defn update-link-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest`

  returns: Result of the UpdateLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest request]
    (-> this (.updateLinkAttributes request))))

(defn list-directories
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest`

  returns: Result of the ListDirectories operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDirectoriesResult`"
  (^com.amazonaws.services.clouddirectory.model.ListDirectoriesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest request]
    (-> this (.listDirectories request))))

(defn disable-directory
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest`

  returns: Result of the DisableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DisableDirectoryResult`"
  (^com.amazonaws.services.clouddirectory.model.DisableDirectoryResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest request]
    (-> this (.disableDirectory request))))

(defn create-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateSchemaRequest`

  returns: Result of the CreateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest request]
    (-> this (.createSchema request))))

(defn delete-object
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteObjectResult`"
  (^com.amazonaws.services.clouddirectory.model.DeleteObjectResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest request]
    (-> this (.deleteObject request))))

(defn get-link-attributes
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest`

  returns: Result of the GetLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult`"
  (^com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest request]
    (-> this (.getLinkAttributes request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudDirectory

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudDirectory this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-object-information
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest`

  returns: Result of the GetObjectInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectInformationResult`"
  (^com.amazonaws.services.clouddirectory.model.GetObjectInformationResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest request]
    (-> this (.getObjectInformation request))))

(defn get-directory
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetDirectoryRequest`

  returns: Result of the GetDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetDirectoryResult`"
  (^com.amazonaws.services.clouddirectory.model.GetDirectoryResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest request]
    (-> this (.getDirectory request))))

(defn put-schema-from-json
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest`

  returns: Result of the PutSchemaFromJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult`"
  (^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest request]
    (-> this (.putSchemaFromJson request))))

(defn create-directory
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateDirectoryResult`"
  (^com.amazonaws.services.clouddirectory.model.CreateDirectoryResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest request]
    (-> this (.createDirectory request))))

(defn delete-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest`

  returns: Result of the DeleteSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.DeleteSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest request]
    (-> this (.deleteSchema request))))

(defn tag-resource
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.TagResourceResult`"
  (^com.amazonaws.services.clouddirectory.model.TagResourceResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-schema-as-json
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest`

  returns: Result of the GetSchemaAsJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult`"
  (^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest request]
    (-> this (.getSchemaAsJson request))))

(defn upgrade-published-schema
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest`

  returns: Result of the UpgradePublishedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult`"
  (^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest request]
    (-> this (.upgradePublishedSchema request))))

(defn attach-typed-link
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest`

  returns: Result of the AttachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult`"
  (^com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest request]
    (-> this (.attachTypedLink request))))

(defn list-managed-schema-arns
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest`

  returns: Result of the ListManagedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest request]
    (-> this (.listManagedSchemaArns request))))

(defn list-applied-schema-arns
  "Description copied from interface: AmazonCloudDirectory

  request - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest`

  returns: Result of the ListAppliedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult`"
  (^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult [^AbstractAmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest request]
    (-> this (.listAppliedSchemaArns request))))

