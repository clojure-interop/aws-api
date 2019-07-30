(ns com.amazonaws.services.clouddirectory.AmazonCloudDirectory
  "Interface for accessing Amazon CloudDirectory.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudDirectory instead.


  Amazon Cloud Directory

  Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
  cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
  programmatically and includes detailed information on data types and errors. For information about Cloud Directory
  features, see AWS Directory Service and the Amazon Cloud
  Directory Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.clouddirectory AmazonCloudDirectory]))

(defn list-object-children
  "Returns a paginated list of child objects that are associated with a given object.

  list-object-children-request - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest`

  returns: Result of the ListObjectChildren operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest list-object-children-request]
    (-> this (.listObjectChildren list-object-children-request))))

(defn list-policy-attachments
  "Returns all of the ObjectIdentifiers to which a given policy is attached.

  list-policy-attachments-request - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest`

  returns: Result of the ListPolicyAttachments operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest list-policy-attachments-request]
    (-> this (.listPolicyAttachments list-policy-attachments-request))))

(defn create-object
  "Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and
   LinkName is specified. An object is simply a collection of Facet attributes. You can also use
   this API call to create a policy object, if the facet from which you create the object is a policy facet.

  create-object-request - `com.amazonaws.services.clouddirectory.model.CreateObjectRequest`

  returns: Result of the CreateObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.CreateObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest create-object-request]
    (-> this (.createObject create-object-request))))

(defn list-tags-for-resource
  "Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
   directory. All 50 tags are returned for a given directory with this API call.

  list-tags-for-resource-request - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn get-facet
  "Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You
   can call this on all kinds of schema facets -- published, development, or applied.

  get-facet-request - `com.amazonaws.services.clouddirectory.model.GetFacetRequest`

  returns: Result of the GetFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest get-facet-request]
    (-> this (.getFacet get-facet-request))))

(defn list-typed-link-facet-attributes
  "Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more
   information, see Typed Links.

  list-typed-link-facet-attributes-request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest`

  returns: Result of the ListTypedLinkFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest list-typed-link-facet-attributes-request]
    (-> this (.listTypedLinkFacetAttributes list-typed-link-facet-attributes-request))))

(defn detach-object
  "Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
   the link name.

  detach-object-request - `com.amazonaws.services.clouddirectory.model.DetachObjectRequest`

  returns: Result of the DetachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest detach-object-request]
    (-> this (.detachObject detach-object-request))))

(defn list-index
  "Lists objects attached to the specified index.

  list-index-request - `com.amazonaws.services.clouddirectory.model.ListIndexRequest`

  returns: Result of the ListIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListIndexResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest list-index-request]
    (-> this (.listIndex list-index-request))))

(defn list-object-attributes
  "Lists all attributes that are associated with an object.

  list-object-attributes-request - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest`

  returns: Result of the ListObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest list-object-attributes-request]
    (-> this (.listObjectAttributes list-object-attributes-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudDirectory this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn detach-from-index
  "Detaches the specified object from the specified index.

  detach-from-index-request - `com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest`

  returns: Result of the DetachFromIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachFromIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachFromIndexResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest detach-from-index-request]
    (-> this (.detachFromIndex detach-from-index-request))))

(defn list-object-parent-paths
  "Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
   objects. For more information about objects, see Directory Structure.


   Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
   up to the requested object. The API returns the number of paths based on user-defined MaxResults, in
   case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
   multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
   from the target object.

  list-object-parent-paths-request - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest`

  returns: Result of the ListObjectParentPaths operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest list-object-parent-paths-request]
    (-> this (.listObjectParentPaths list-object-parent-paths-request))))

(defn list-published-schema-arns
  "Lists the major version families of each published schema. If a major version ARN is provided as
   SchemaArn, the minor version revisions in that family are listed instead.

  list-published-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest`

  returns: Result of the ListPublishedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest list-published-schema-arns-request]
    (-> this (.listPublishedSchemaArns list-published-schema-arns-request))))

(defn attach-to-index
  "Attaches the specified object to the specified index.

  attach-to-index-request - `com.amazonaws.services.clouddirectory.model.AttachToIndexRequest`

  returns: Result of the AttachToIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachToIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.AttachToIndexResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest attach-to-index-request]
    (-> this (.attachToIndex attach-to-index-request))))

(defn delete-directory
  "Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
   extreme caution when deleting directories.

  delete-directory-request - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest delete-directory-request]
    (-> this (.deleteDirectory delete-directory-request))))

(defn lookup-policy
  "Lists all policies from the root of the Directory to the object specified. If there are no policies
   present, an empty list is returned. If policies are present, and if some objects don't have the policies
   attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns
   ObjectIdentifier, policyId, and policyType. Paths that don't lead to the
   root from the target object are ignored. For more information, see Policies.

  lookup-policy-request - `com.amazonaws.services.clouddirectory.model.LookupPolicyRequest`

  returns: Result of the LookupPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.LookupPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.LookupPolicyResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest lookup-policy-request]
    (-> this (.lookupPolicy lookup-policy-request))))

(defn publish-schema
  "Publishes a development schema with a major version and a recommended minor version.

  publish-schema-request - `com.amazonaws.services.clouddirectory.model.PublishSchemaRequest`

  returns: Result of the PublishSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PublishSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.PublishSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest publish-schema-request]
    (-> this (.publishSchema publish-schema-request))))

(defn delete-typed-link-facet
  "Deletes a TypedLinkFacet. For more information, see Typed Links.

  delete-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest`

  returns: Result of the DeleteTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest delete-typed-link-facet-request]
    (-> this (.deleteTypedLinkFacet delete-typed-link-facet-request))))

(defn attach-object
  "Attaches an existing object to another object. An object can be accessed in two ways:




   Using the path




   Using ObjectIdentifier

  attach-object-request - `com.amazonaws.services.clouddirectory.model.AttachObjectRequest`

  returns: Result of the AttachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.AttachObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest attach-object-request]
    (-> this (.attachObject attach-object-request))))

(defn untag-resource
  "An API operation for removing tags from a resource.

  untag-resource-request - `com.amazonaws.services.clouddirectory.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UntagResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.UntagResourceResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn upgrade-applied-schema
  "Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in
   MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers
   on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
   directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
   directory.

  upgrade-applied-schema-request - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest`

  returns: Result of the UpgradeAppliedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest upgrade-applied-schema-request]
    (-> this (.upgradeAppliedSchema upgrade-applied-schema-request))))

(defn get-applied-schema-version
  "Returns current applied schema version ARN, including the minor version in use.

  get-applied-schema-version-request - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest`

  returns: Result of the GetAppliedSchemaVersion operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest get-applied-schema-version-request]
    (-> this (.getAppliedSchemaVersion get-applied-schema-version-request))))

(defn create-facet
  "Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.

  create-facet-request - `com.amazonaws.services.clouddirectory.model.CreateFacetRequest`

  returns: Result of the CreateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.CreateFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest create-facet-request]
    (-> this (.createFacet create-facet-request))))

(defn list-typed-link-facet-names
  "Returns a paginated list of TypedLink facet names for a particular schema. For more information, see
   Typed Links.

  list-typed-link-facet-names-request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest`

  returns: Result of the ListTypedLinkFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest list-typed-link-facet-names-request]
    (-> this (.listTypedLinkFacetNames list-typed-link-facet-names-request))))

(defn list-outgoing-typed-links
  "Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  list-outgoing-typed-links-request - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest`

  returns: Result of the ListOutgoingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest list-outgoing-typed-links-request]
    (-> this (.listOutgoingTypedLinks list-outgoing-typed-links-request))))

(defn get-object-attributes
  "Retrieves attributes within a facet that are associated with an object.

  get-object-attributes-request - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest`

  returns: Result of the GetObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest get-object-attributes-request]
    (-> this (.getObjectAttributes get-object-attributes-request))))

(defn detach-typed-link
  "Detaches a typed link from a specified source and target object. For more information, see Typed Links.

  detach-typed-link-request - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest`

  returns: Result of the DetachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest detach-typed-link-request]
    (-> this (.detachTypedLink detach-typed-link-request))))

(defn list-attached-indices
  "Lists indices attached to the specified object.

  list-attached-indices-request - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest`

  returns: Result of the ListAttachedIndices operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest list-attached-indices-request]
    (-> this (.listAttachedIndices list-attached-indices-request))))

(defn list-facet-attributes
  "Retrieves attributes attached to the facet.

  list-facet-attributes-request - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest`

  returns: Result of the ListFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest list-facet-attributes-request]
    (-> this (.listFacetAttributes list-facet-attributes-request))))

(defn list-facet-names
  "Retrieves the names of facets that exist in a schema.

  list-facet-names-request - `com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest`

  returns: Result of the ListFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetNamesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListFacetNamesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest list-facet-names-request]
    (-> this (.listFacetNames list-facet-names-request))))

(defn batch-read
  "Performs all the read operations in a batch.

  batch-read-request - `com.amazonaws.services.clouddirectory.model.BatchReadRequest`

  returns: Result of the BatchRead operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchReadResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.BatchReadResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest batch-read-request]
    (-> this (.batchRead batch-read-request))))

(defn update-typed-link-facet
  "Updates a TypedLinkFacet. For more information, see Typed Links.

  update-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest`

  returns: Result of the UpdateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidFacetUpdateException - An attempt to modify a Facet resulted in an invalid schema exception."
  (^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest update-typed-link-facet-request]
    (-> this (.updateTypedLinkFacet update-typed-link-facet-request))))

(defn update-object-attributes
  "Updates a given object's attributes.

  update-object-attributes-request - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest`

  returns: Result of the UpdateObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest update-object-attributes-request]
    (-> this (.updateObjectAttributes update-object-attributes-request))))

(defn list-object-policies
  "Returns policies attached to an object in pagination fashion.

  list-object-policies-request - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest`

  returns: Result of the ListObjectPolicies operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest list-object-policies-request]
    (-> this (.listObjectPolicies list-object-policies-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudDirectory this]
    (-> this (.shutdown))))

(defn update-schema
  "Updates the schema name with a new name. Only development schema names can be updated.

  update-schema-request - `com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest`

  returns: Result of the UpdateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.UpdateSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest update-schema-request]
    (-> this (.updateSchema update-schema-request))))

(defn add-facet-to-object
  "Adds a new Facet to an object. An object can have more than one facet applied on it.

  add-facet-to-object-request - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest`

  returns: Result of the AddFacetToObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest add-facet-to-object-request]
    (-> this (.addFacetToObject add-facet-to-object-request))))

(defn attach-policy
  "Attaches a policy object to a regular object. An object can have a limited number of attached policies.

  attach-policy-request - `com.amazonaws.services.clouddirectory.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.AttachPolicyResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest attach-policy-request]
    (-> this (.attachPolicy attach-policy-request))))

(defn list-development-schema-arns
  "Retrieves each Amazon Resource Name (ARN) of schemas in the development state.

  list-development-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest`

  returns: Result of the ListDevelopmentSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest list-development-schema-arns-request]
    (-> this (.listDevelopmentSchemaArns list-development-schema-arns-request))))

(defn batch-write
  "Performs all the write operations in a batch. Either all the operations succeed or none.

  batch-write-request - `com.amazonaws.services.clouddirectory.model.BatchWriteRequest`

  returns: Result of the BatchWrite operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchWriteResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.BatchWriteResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest batch-write-request]
    (-> this (.batchWrite batch-write-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"clouddirectory.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"clouddirectory.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudDirectory this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-facet-from-object
  "Removes the specified facet from the specified object.

  remove-facet-from-object-request - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest`

  returns: Result of the RemoveFacetFromObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest remove-facet-from-object-request]
    (-> this (.removeFacetFromObject remove-facet-from-object-request))))

(defn delete-facet
  "Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted.
   Only development schema facets are allowed deletion.

  delete-facet-request - `com.amazonaws.services.clouddirectory.model.DeleteFacetRequest`

  returns: Result of the DeleteFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest delete-facet-request]
    (-> this (.deleteFacet delete-facet-request))))

(defn enable-directory
  "Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
   be read and written to.

  enable-directory-request - `com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest`

  returns: Result of the EnableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.EnableDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.ResourceNotFoundException - The specified resource could not be found."
  (^com.amazonaws.services.clouddirectory.model.EnableDirectoryResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest enable-directory-request]
    (-> this (.enableDirectory enable-directory-request))))

(defn update-facet
  "Does the following:




   Adds new Attributes, Rules, or ObjectTypes.




   Updates existing Attributes, Rules, or ObjectTypes.




   Deletes existing Attributes, Rules, or ObjectTypes.

  update-facet-request - `com.amazonaws.services.clouddirectory.model.UpdateFacetRequest`

  returns: Result of the UpdateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidFacetUpdateException - An attempt to modify a Facet resulted in an invalid schema exception."
  (^com.amazonaws.services.clouddirectory.model.UpdateFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest update-facet-request]
    (-> this (.updateFacet update-facet-request))))

(defn list-object-parents
  "Lists parent objects that are associated with a given object in pagination fashion.

  list-object-parents-request - `com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest`

  returns: Result of the ListObjectParents operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentsResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest list-object-parents-request]
    (-> this (.listObjectParents list-object-parents-request))))

(defn detach-policy
  "Detaches a policy from an object.

  detach-policy-request - `com.amazonaws.services.clouddirectory.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.DetachPolicyResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest detach-policy-request]
    (-> this (.detachPolicy detach-policy-request))))

(defn get-typed-link-facet-information
  "Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.

  get-typed-link-facet-information-request - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest`

  returns: Result of the GetTypedLinkFacetInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest get-typed-link-facet-information-request]
    (-> this (.getTypedLinkFacetInformation get-typed-link-facet-information-request))))

(defn create-index
  "Creates an index object. See Indexing and
   search for more information.

  create-index-request - `com.amazonaws.services.clouddirectory.model.CreateIndexRequest`

  returns: Result of the CreateIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.CreateIndexResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest create-index-request]
    (-> this (.createIndex create-index-request))))

(defn list-incoming-typed-links
  "Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  list-incoming-typed-links-request - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest`

  returns: Result of the ListIncomingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest list-incoming-typed-links-request]
    (-> this (.listIncomingTypedLinks list-incoming-typed-links-request))))

(defn apply-schema
  "Copies the input published schema, at the specified version, into the Directory with the same name and
   version as that of the published schema.

  apply-schema-request - `com.amazonaws.services.clouddirectory.model.ApplySchemaRequest`

  returns: Result of the ApplySchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ApplySchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ApplySchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest apply-schema-request]
    (-> this (.applySchema apply-schema-request))))

(defn create-typed-link-facet
  "Creates a TypedLinkFacet. For more information, see Typed Links.

  create-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest`

  returns: Result of the CreateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest create-typed-link-facet-request]
    (-> this (.createTypedLinkFacet create-typed-link-facet-request))))

(defn update-link-attributes
  "Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s
   identity, as defined by its IdentityAttributeOrder.

  update-link-attributes-request - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest`

  returns: Result of the UpdateLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest update-link-attributes-request]
    (-> this (.updateLinkAttributes update-link-attributes-request))))

(defn list-directories
  "Lists directories created within an account.

  list-directories-request - `com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest`

  returns: Result of the ListDirectories operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDirectoriesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListDirectoriesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest list-directories-request]
    (-> this (.listDirectories list-directories-request))))

(defn disable-directory
  "Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
   be disabled. Disabled directories may be reenabled.

  disable-directory-request - `com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest`

  returns: Result of the DisableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DisableDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.ResourceNotFoundException - The specified resource could not be found."
  (^com.amazonaws.services.clouddirectory.model.DisableDirectoryResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest disable-directory-request]
    (-> this (.disableDirectory disable-directory-request))))

(defn create-schema
  "Creates a new schema in a development state. A schema can exist in three phases:




   Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the
   schema is finalized, it can be published.




   Published: Published schemas are immutable and have a version associated with them.




   Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
   new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.

  create-schema-request - `com.amazonaws.services.clouddirectory.model.CreateSchemaRequest`

  returns: Result of the CreateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.CreateSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest create-schema-request]
    (-> this (.createSchema create-schema-request))))

(defn delete-object
  "Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The
   maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory
   Limits.

  delete-object-request - `com.amazonaws.services.clouddirectory.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteObjectResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObject delete-object-request))))

(defn get-link-attributes
  "Retrieves attributes that are associated with a typed link.

  get-link-attributes-request - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest`

  returns: Result of the GetLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest get-link-attributes-request]
    (-> this (.getLinkAttributes get-link-attributes-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudDirectory this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-object-information
  "Retrieves metadata about an object.

  get-object-information-request - `com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest`

  returns: Result of the GetObjectInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectInformationResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetObjectInformationResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest get-object-information-request]
    (-> this (.getObjectInformation get-object-information-request))))

(defn get-directory
  "Retrieves metadata about a directory.

  get-directory-request - `com.amazonaws.services.clouddirectory.model.GetDirectoryRequest`

  returns: Result of the GetDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetDirectoryResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest get-directory-request]
    (-> this (.getDirectory get-directory-request))))

(defn put-schema-from-json
  "Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON
   Schema Format for more information.

  put-schema-from-json-request - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest`

  returns: Result of the PutSchemaFromJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest put-schema-from-json-request]
    (-> this (.putSchemaFromJson put-schema-from-json-request))))

(defn create-directory
  "Creates a Directory by copying the published schema into the directory. A directory cannot be created
   without a schema.


   You can also quickly create a directory using a managed schema, called the QuickStartSchema. For
   more information, see Managed Schema
   in the Amazon Cloud Directory Developer Guide.

  create-directory-request - `com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.CreateDirectoryResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest create-directory-request]
    (-> this (.createDirectory create-directory-request))))

(defn delete-schema
  "Deletes a given schema. Schemas in a development and published state can only be deleted.

  delete-schema-request - `com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest`

  returns: Result of the DeleteSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.DeleteSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest delete-schema-request]
    (-> this (.deleteSchema delete-schema-request))))

(defn tag-resource
  "An API operation for adding tags to a resource.

  tag-resource-request - `com.amazonaws.services.clouddirectory.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.TagResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.TagResourceResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-schema-as-json
  "Retrieves a JSON representation of the schema. See JSON
   Schema Format for more information.

  get-schema-as-json-request - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest`

  returns: Result of the GetSchemaAsJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest get-schema-as-json-request]
    (-> this (.getSchemaAsJson get-schema-as-json-request))))

(defn upgrade-published-schema
  "Upgrades a published schema under a new minor version revision using the current contents of
   DevelopmentSchemaArn.

  upgrade-published-schema-request - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest`

  returns: Result of the UpgradePublishedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest upgrade-published-schema-request]
    (-> this (.upgradePublishedSchema upgrade-published-schema-request))))

(defn attach-typed-link
  "Attaches a typed link to a specified source and target object. For more information, see Typed Links.

  attach-typed-link-request - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest`

  returns: Result of the AttachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest attach-typed-link-request]
    (-> this (.attachTypedLink attach-typed-link-request))))

(defn list-managed-schema-arns
  "Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the
   minor version revisions in that family are listed instead.

  list-managed-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest`

  returns: Result of the ListManagedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest list-managed-schema-arns-request]
    (-> this (.listManagedSchemaArns list-managed-schema-arns-request))))

(defn list-applied-schema-arns
  "Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor
   version.

  list-applied-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest`

  returns: Result of the ListAppliedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult [^AmazonCloudDirectory this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest list-applied-schema-arns-request]
    (-> this (.listAppliedSchemaArns list-applied-schema-arns-request))))

