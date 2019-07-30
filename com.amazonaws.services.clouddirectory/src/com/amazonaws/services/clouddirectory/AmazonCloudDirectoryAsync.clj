(ns com.amazonaws.services.clouddirectory.AmazonCloudDirectoryAsync
  "Interface for accessing Amazon CloudDirectory asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudDirectoryAsync instead.


  Amazon Cloud Directory

  Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
  cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
  programmatically and includes detailed information on data types and errors. For information about Cloud Directory
  features, see AWS Directory Service and the Amazon Cloud
  Directory Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.clouddirectory AmazonCloudDirectoryAsync]))

(defn untag-resource-async
  "An API operation for removing tags from a resource.

  untag-resource-request - `com.amazonaws.services.clouddirectory.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn create-object-async
  "Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and
   LinkName is specified. An object is simply a collection of Facet attributes. You can also use
   this API call to create a policy object, if the facet from which you create the object is a policy facet.

  create-object-request - `com.amazonaws.services.clouddirectory.model.CreateObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest create-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createObjectAsync create-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest create-object-request]
    (-> this (.createObjectAsync create-object-request))))

(defn list-published-schema-arns-async
  "Lists the major version families of each published schema. If a major version ARN is provided as
   SchemaArn, the minor version revisions in that family are listed instead.

  list-published-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublishedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest list-published-schema-arns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublishedSchemaArnsAsync list-published-schema-arns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest list-published-schema-arns-request]
    (-> this (.listPublishedSchemaArnsAsync list-published-schema-arns-request))))

(defn attach-to-index-async
  "Attaches the specified object to the specified index.

  attach-to-index-request - `com.amazonaws.services.clouddirectory.model.AttachToIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachToIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachToIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest attach-to-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachToIndexAsync attach-to-index-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest attach-to-index-request]
    (-> this (.attachToIndexAsync attach-to-index-request))))

(defn list-development-schema-arns-async
  "Retrieves each Amazon Resource Name (ARN) of schemas in the development state.

  list-development-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevelopmentSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest list-development-schema-arns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevelopmentSchemaArnsAsync list-development-schema-arns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest list-development-schema-arns-request]
    (-> this (.listDevelopmentSchemaArnsAsync list-development-schema-arns-request))))

(defn list-managed-schema-arns-async
  "Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the
   minor version revisions in that family are listed instead.

  list-managed-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListManagedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest list-managed-schema-arns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listManagedSchemaArnsAsync list-managed-schema-arns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest list-managed-schema-arns-request]
    (-> this (.listManagedSchemaArnsAsync list-managed-schema-arns-request))))

(defn get-directory-async
  "Retrieves metadata about a directory.

  get-directory-request - `com.amazonaws.services.clouddirectory.model.GetDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest get-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDirectoryAsync get-directory-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest get-directory-request]
    (-> this (.getDirectoryAsync get-directory-request))))

(defn list-facet-attributes-async
  "Retrieves attributes attached to the facet.

  list-facet-attributes-request - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFacetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest list-facet-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacetAttributesAsync list-facet-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest list-facet-attributes-request]
    (-> this (.listFacetAttributesAsync list-facet-attributes-request))))

(defn get-facet-async
  "Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You
   can call this on all kinds of schema facets -- published, development, or applied.

  get-facet-request - `com.amazonaws.services.clouddirectory.model.GetFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest get-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFacetAsync get-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest get-facet-request]
    (-> this (.getFacetAsync get-facet-request))))

(defn list-applied-schema-arns-async
  "Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor
   version.

  list-applied-schema-arns-request - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAppliedSchemaArns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest list-applied-schema-arns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppliedSchemaArnsAsync list-applied-schema-arns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest list-applied-schema-arns-request]
    (-> this (.listAppliedSchemaArnsAsync list-applied-schema-arns-request))))

(defn attach-policy-async
  "Attaches a policy object to a regular object. An object can have a limited number of attached policies.

  attach-policy-request - `com.amazonaws.services.clouddirectory.model.AttachPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest attach-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync attach-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest attach-policy-request]
    (-> this (.attachPolicyAsync attach-policy-request))))

(defn create-facet-async
  "Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.

  create-facet-request - `com.amazonaws.services.clouddirectory.model.CreateFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest create-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFacetAsync create-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest create-facet-request]
    (-> this (.createFacetAsync create-facet-request))))

(defn create-index-async
  "Creates an index object. See Indexing and
   search for more information.

  create-index-request - `com.amazonaws.services.clouddirectory.model.CreateIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest create-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIndexAsync create-index-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest create-index-request]
    (-> this (.createIndexAsync create-index-request))))

(defn list-typed-link-facet-names-async
  "Returns a paginated list of TypedLink facet names for a particular schema. For more information, see
   Typed Links.

  list-typed-link-facet-names-request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypedLinkFacetNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest list-typed-link-facet-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypedLinkFacetNamesAsync list-typed-link-facet-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest list-typed-link-facet-names-request]
    (-> this (.listTypedLinkFacetNamesAsync list-typed-link-facet-names-request))))

(defn get-object-information-async
  "Retrieves metadata about an object.

  get-object-information-request - `com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObjectInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetObjectInformationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest get-object-information-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectInformationAsync get-object-information-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest get-object-information-request]
    (-> this (.getObjectInformationAsync get-object-information-request))))

(defn update-facet-async
  "Does the following:




   Adds new Attributes, Rules, or ObjectTypes.




   Updates existing Attributes, Rules, or ObjectTypes.




   Deletes existing Attributes, Rules, or ObjectTypes.

  update-facet-request - `com.amazonaws.services.clouddirectory.model.UpdateFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest update-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFacetAsync update-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest update-facet-request]
    (-> this (.updateFacetAsync update-facet-request))))

(defn list-policy-attachments-async
  "Returns all of the ObjectIdentifiers to which a given policy is attached.

  list-policy-attachments-request - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyAttachments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest list-policy-attachments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyAttachmentsAsync list-policy-attachments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest list-policy-attachments-request]
    (-> this (.listPolicyAttachmentsAsync list-policy-attachments-request))))

(defn delete-facet-async
  "Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted.
   Only development schema facets are allowed deletion.

  delete-facet-request - `com.amazonaws.services.clouddirectory.model.DeleteFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest delete-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFacetAsync delete-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest delete-facet-request]
    (-> this (.deleteFacetAsync delete-facet-request))))

(defn put-schema-from-json-async
  "Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON
   Schema Format for more information.

  put-schema-from-json-request - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSchemaFromJson operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest put-schema-from-json-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSchemaFromJsonAsync put-schema-from-json-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest put-schema-from-json-request]
    (-> this (.putSchemaFromJsonAsync put-schema-from-json-request))))

(defn attach-typed-link-async
  "Attaches a typed link to a specified source and target object. For more information, see Typed Links.

  attach-typed-link-request - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachTypedLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest attach-typed-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachTypedLinkAsync attach-typed-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest attach-typed-link-request]
    (-> this (.attachTypedLinkAsync attach-typed-link-request))))

(defn detach-policy-async
  "Detaches a policy from an object.

  detach-policy-request - `com.amazonaws.services.clouddirectory.model.DetachPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest detach-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync detach-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest detach-policy-request]
    (-> this (.detachPolicyAsync detach-policy-request))))

(defn update-link-attributes-async
  "Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s
   identity, as defined by its IdentityAttributeOrder.

  update-link-attributes-request - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLinkAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest update-link-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLinkAttributesAsync update-link-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest update-link-attributes-request]
    (-> this (.updateLinkAttributesAsync update-link-attributes-request))))

(defn attach-object-async
  "Attaches an existing object to another object. An object can be accessed in two ways:




   Using the path




   Using ObjectIdentifier

  attach-object-request - `com.amazonaws.services.clouddirectory.model.AttachObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AttachObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest attach-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachObjectAsync attach-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest attach-object-request]
    (-> this (.attachObjectAsync attach-object-request))))

(defn update-typed-link-facet-async
  "Updates a TypedLinkFacet. For more information, see Typed Links.

  update-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest update-typed-link-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTypedLinkFacetAsync update-typed-link-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest update-typed-link-facet-request]
    (-> this (.updateTypedLinkFacetAsync update-typed-link-facet-request))))

(defn detach-typed-link-async
  "Detaches a typed link from a specified source and target object. For more information, see Typed Links.

  detach-typed-link-request - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachTypedLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest detach-typed-link-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachTypedLinkAsync detach-typed-link-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest detach-typed-link-request]
    (-> this (.detachTypedLinkAsync detach-typed-link-request))))

(defn add-facet-to-object-async
  "Adds a new Facet to an object. An object can have more than one facet applied on it.

  add-facet-to-object-request - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddFacetToObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest add-facet-to-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addFacetToObjectAsync add-facet-to-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest add-facet-to-object-request]
    (-> this (.addFacetToObjectAsync add-facet-to-object-request))))

(defn create-typed-link-facet-async
  "Creates a TypedLinkFacet. For more information, see Typed Links.

  create-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest create-typed-link-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTypedLinkFacetAsync create-typed-link-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest create-typed-link-facet-request]
    (-> this (.createTypedLinkFacetAsync create-typed-link-facet-request))))

(defn get-typed-link-facet-information-async
  "Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.

  get-typed-link-facet-information-request - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTypedLinkFacetInformation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest get-typed-link-facet-information-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTypedLinkFacetInformationAsync get-typed-link-facet-information-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest get-typed-link-facet-information-request]
    (-> this (.getTypedLinkFacetInformationAsync get-typed-link-facet-information-request))))

(defn get-link-attributes-async
  "Retrieves attributes that are associated with a typed link.

  get-link-attributes-request - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLinkAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest get-link-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLinkAttributesAsync get-link-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest get-link-attributes-request]
    (-> this (.getLinkAttributesAsync get-link-attributes-request))))

(defn delete-schema-async
  "Deletes a given schema. Schemas in a development and published state can only be deleted.

  delete-schema-request - `com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest delete-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSchemaAsync delete-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest delete-schema-request]
    (-> this (.deleteSchemaAsync delete-schema-request))))

(defn detach-from-index-async
  "Detaches the specified object from the specified index.

  detach-from-index-request - `com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachFromIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachFromIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest detach-from-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachFromIndexAsync detach-from-index-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest detach-from-index-request]
    (-> this (.detachFromIndexAsync detach-from-index-request))))

(defn disable-directory-async
  "Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
   be disabled. Disabled directories may be reenabled.

  disable-directory-request - `com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DisableDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest disable-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDirectoryAsync disable-directory-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest disable-directory-request]
    (-> this (.disableDirectoryAsync disable-directory-request))))

(defn list-attached-indices-async
  "Lists indices attached to the specified object.

  list-attached-indices-request - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedIndices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest list-attached-indices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedIndicesAsync list-attached-indices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest list-attached-indices-request]
    (-> this (.listAttachedIndicesAsync list-attached-indices-request))))

(defn list-object-attributes-async
  "Lists all attributes that are associated with an object.

  list-object-attributes-request - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest list-object-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectAttributesAsync list-object-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest list-object-attributes-request]
    (-> this (.listObjectAttributesAsync list-object-attributes-request))))

(defn get-applied-schema-version-async
  "Returns current applied schema version ARN, including the minor version in use.

  get-applied-schema-version-request - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAppliedSchemaVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest get-applied-schema-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppliedSchemaVersionAsync get-applied-schema-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest get-applied-schema-version-request]
    (-> this (.getAppliedSchemaVersionAsync get-applied-schema-version-request))))

(defn lookup-policy-async
  "Lists all policies from the root of the Directory to the object specified. If there are no policies
   present, an empty list is returned. If policies are present, and if some objects don't have the policies
   attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns
   ObjectIdentifier, policyId, and policyType. Paths that don't lead to the
   root from the target object are ignored. For more information, see Policies.

  lookup-policy-request - `com.amazonaws.services.clouddirectory.model.LookupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.LookupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest lookup-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupPolicyAsync lookup-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest lookup-policy-request]
    (-> this (.lookupPolicyAsync lookup-policy-request))))

(defn update-schema-async
  "Updates the schema name with a new name. Only development schema names can be updated.

  update-schema-request - `com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest update-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSchemaAsync update-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest update-schema-request]
    (-> this (.updateSchemaAsync update-schema-request))))

(defn list-outgoing-typed-links-async
  "Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  list-outgoing-typed-links-request - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOutgoingTypedLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest list-outgoing-typed-links-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOutgoingTypedLinksAsync list-outgoing-typed-links-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest list-outgoing-typed-links-request]
    (-> this (.listOutgoingTypedLinksAsync list-outgoing-typed-links-request))))

(defn list-object-parent-paths-async
  "Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
   objects. For more information about objects, see Directory Structure.


   Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
   up to the requested object. The API returns the number of paths based on user-defined MaxResults, in
   case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
   multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
   from the target object.

  list-object-parent-paths-request - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectParentPaths operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest list-object-parent-paths-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectParentPathsAsync list-object-parent-paths-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest list-object-parent-paths-request]
    (-> this (.listObjectParentPathsAsync list-object-parent-paths-request))))

(defn get-object-attributes-async
  "Retrieves attributes within a facet that are associated with an object.

  get-object-attributes-request - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest get-object-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectAttributesAsync get-object-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest get-object-attributes-request]
    (-> this (.getObjectAttributesAsync get-object-attributes-request))))

(defn delete-directory-async
  "Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
   extreme caution when deleting directories.

  delete-directory-request - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest delete-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryAsync delete-directory-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest delete-directory-request]
    (-> this (.deleteDirectoryAsync delete-directory-request))))

(defn list-facet-names-async
  "Retrieves the names of facets that exist in a schema.

  list-facet-names-request - `com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFacetNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListFacetNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest list-facet-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacetNamesAsync list-facet-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest list-facet-names-request]
    (-> this (.listFacetNamesAsync list-facet-names-request))))

(defn apply-schema-async
  "Copies the input published schema, at the specified version, into the Directory with the same name and
   version as that of the published schema.

  apply-schema-request - `com.amazonaws.services.clouddirectory.model.ApplySchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ApplySchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest apply-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySchemaAsync apply-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest apply-schema-request]
    (-> this (.applySchemaAsync apply-schema-request))))

(defn enable-directory-async
  "Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
   be read and written to.

  enable-directory-request - `com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.EnableDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest enable-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDirectoryAsync enable-directory-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest enable-directory-request]
    (-> this (.enableDirectoryAsync enable-directory-request))))

(defn list-typed-link-facet-attributes-async
  "Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more
   information, see Typed Links.

  list-typed-link-facet-attributes-request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTypedLinkFacetAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest list-typed-link-facet-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTypedLinkFacetAttributesAsync list-typed-link-facet-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest list-typed-link-facet-attributes-request]
    (-> this (.listTypedLinkFacetAttributesAsync list-typed-link-facet-attributes-request))))

(defn list-directories-async
  "Lists directories created within an account.

  list-directories-request - `com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListDirectoriesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest list-directories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDirectoriesAsync list-directories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest list-directories-request]
    (-> this (.listDirectoriesAsync list-directories-request))))

(defn list-tags-for-resource-async
  "Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
   directory. All 50 tags are returned for a given directory with this API call.

  list-tags-for-resource-request - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn list-object-policies-async
  "Returns policies attached to an object in pagination fashion.

  list-object-policies-request - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest list-object-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectPoliciesAsync list-object-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest list-object-policies-request]
    (-> this (.listObjectPoliciesAsync list-object-policies-request))))

(defn update-object-attributes-async
  "Updates a given object's attributes.

  update-object-attributes-request - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateObjectAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest update-object-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateObjectAttributesAsync update-object-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest update-object-attributes-request]
    (-> this (.updateObjectAttributesAsync update-object-attributes-request))))

(defn batch-write-async
  "Performs all the write operations in a batch. Either all the operations succeed or none.

  batch-write-request - `com.amazonaws.services.clouddirectory.model.BatchWriteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchWrite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.BatchWriteResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest batch-write-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchWriteAsync batch-write-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest batch-write-request]
    (-> this (.batchWriteAsync batch-write-request))))

(defn create-schema-async
  "Creates a new schema in a development state. A schema can exist in three phases:




   Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the
   schema is finalized, it can be published.




   Published: Published schemas are immutable and have a version associated with them.




   Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
   new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.

  create-schema-request - `com.amazonaws.services.clouddirectory.model.CreateSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest create-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSchemaAsync create-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest create-schema-request]
    (-> this (.createSchemaAsync create-schema-request))))

(defn delete-object-async
  "Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The
   maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory
   Limits.

  delete-object-request - `com.amazonaws.services.clouddirectory.model.DeleteObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest delete-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteObjectAsync delete-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObjectAsync delete-object-request))))

(defn delete-typed-link-facet-async
  "Deletes a TypedLinkFacet. For more information, see Typed Links.

  delete-typed-link-facet-request - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTypedLinkFacet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest delete-typed-link-facet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTypedLinkFacetAsync delete-typed-link-facet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest delete-typed-link-facet-request]
    (-> this (.deleteTypedLinkFacetAsync delete-typed-link-facet-request))))

(defn publish-schema-async
  "Publishes a development schema with a major version and a recommended minor version.

  publish-schema-request - `com.amazonaws.services.clouddirectory.model.PublishSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PublishSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.PublishSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest publish-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishSchemaAsync publish-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest publish-schema-request]
    (-> this (.publishSchemaAsync publish-schema-request))))

(defn create-directory-async
  "Creates a Directory by copying the published schema into the directory. A directory cannot be created
   without a schema.


   You can also quickly create a directory using a managed schema, called the QuickStartSchema. For
   more information, see Managed Schema
   in the Amazon Cloud Directory Developer Guide.

  create-directory-request - `com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.CreateDirectoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest create-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryAsync create-directory-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest create-directory-request]
    (-> this (.createDirectoryAsync create-directory-request))))

(defn list-index-async
  "Lists objects attached to the specified index.

  list-index-request - `com.amazonaws.services.clouddirectory.model.ListIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListIndexResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest list-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIndexAsync list-index-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest list-index-request]
    (-> this (.listIndexAsync list-index-request))))

(defn detach-object-async
  "Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
   the link name.

  detach-object-request - `com.amazonaws.services.clouddirectory.model.DetachObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.DetachObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest detach-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachObjectAsync detach-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest detach-object-request]
    (-> this (.detachObjectAsync detach-object-request))))

(defn list-incoming-typed-links-async
  "Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  list-incoming-typed-links-request - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIncomingTypedLinks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest list-incoming-typed-links-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIncomingTypedLinksAsync list-incoming-typed-links-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest list-incoming-typed-links-request]
    (-> this (.listIncomingTypedLinksAsync list-incoming-typed-links-request))))

(defn batch-read-async
  "Performs all the read operations in a batch.

  batch-read-request - `com.amazonaws.services.clouddirectory.model.BatchReadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchRead operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.BatchReadResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest batch-read-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchReadAsync batch-read-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest batch-read-request]
    (-> this (.batchReadAsync batch-read-request))))

(defn list-object-parents-async
  "Lists parent objects that are associated with a given object in pagination fashion.

  list-object-parents-request - `com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectParents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectParentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest list-object-parents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectParentsAsync list-object-parents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest list-object-parents-request]
    (-> this (.listObjectParentsAsync list-object-parents-request))))

(defn upgrade-published-schema-async
  "Upgrades a published schema under a new minor version revision using the current contents of
   DevelopmentSchemaArn.

  upgrade-published-schema-request - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradePublishedSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest upgrade-published-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradePublishedSchemaAsync upgrade-published-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest upgrade-published-schema-request]
    (-> this (.upgradePublishedSchemaAsync upgrade-published-schema-request))))

(defn tag-resource-async
  "An API operation for adding tags to a resource.

  tag-resource-request - `com.amazonaws.services.clouddirectory.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn remove-facet-from-object-async
  "Removes the specified facet from the specified object.

  remove-facet-from-object-request - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveFacetFromObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest remove-facet-from-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeFacetFromObjectAsync remove-facet-from-object-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest remove-facet-from-object-request]
    (-> this (.removeFacetFromObjectAsync remove-facet-from-object-request))))

(defn upgrade-applied-schema-async
  "Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in
   MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers
   on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
   directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
   directory.

  upgrade-applied-schema-request - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradeAppliedSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest upgrade-applied-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradeAppliedSchemaAsync upgrade-applied-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest upgrade-applied-schema-request]
    (-> this (.upgradeAppliedSchemaAsync upgrade-applied-schema-request))))

(defn get-schema-as-json-async
  "Retrieves a JSON representation of the schema. See JSON
   Schema Format for more information.

  get-schema-as-json-request - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSchemaAsJson operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest get-schema-as-json-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSchemaAsJsonAsync get-schema-as-json-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest get-schema-as-json-request]
    (-> this (.getSchemaAsJsonAsync get-schema-as-json-request))))

(defn list-object-children-async
  "Returns a paginated list of child objects that are associated with a given object.

  list-object-children-request - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListObjectChildren operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult>`"
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest list-object-children-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listObjectChildrenAsync list-object-children-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudDirectoryAsync this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest list-object-children-request]
    (-> this (.listObjectChildrenAsync list-object-children-request))))

