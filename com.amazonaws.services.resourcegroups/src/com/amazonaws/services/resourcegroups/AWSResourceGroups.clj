(ns com.amazonaws.services.resourcegroups.AWSResourceGroups
  "Interface for accessing Resource Groups.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSResourceGroups instead.


  AWS Resource Groups

  AWS Resource Groups lets you organize AWS resources such as Amazon EC2 instances, Amazon Relational Database Service
  databases, and Amazon S3 buckets into groups using criteria that you define as tags. A resource group is a collection
  of resources that match the resource types specified in a query, and share one or more tags or portions of tags. You
  can create a group of resources based on their roles in your cloud infrastructure, lifecycle stages, regions,
  application layers, or virtually any criteria. Resource groups enable you to automate management tasks, such as those
  in AWS Systems Manager Automation documents, on tag-related resources in AWS Systems Manager. Groups of tagged
  resources also let you quickly view a custom console in AWS Systems Manager that shows AWS Config compliance and
  other monitoring data about member resources.


  To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
  group have in common. Tags are key-value pairs.


  For more information about Resource Groups, see the AWS Resource Groups User Guide.


  AWS Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.




  Create, Read, Update, and Delete (CRUD) operations on resource groups and resource query entities




  Applying, editing, and removing tags from resource groups




  Resolving resource group member ARNs so they can be returned as search results




  Getting data about resources that are members of a group




  Searching AWS resources based on a resource query"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroups AWSResourceGroups]))

(defn get-group-query
  "Returns the resource query associated with the specified resource group.

  get-group-query-request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`

  returns: Result of the GetGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupQueryResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetGroupQueryResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest get-group-query-request]
    (-> this (.getGroupQuery get-group-query-request))))

(defn delete-group
  "Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
   group; it only deletes the group structure.

  delete-group-request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.DeleteGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.DeleteGroupResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroup delete-group-request))))

(defn update-group
  "Updates an existing group with a new or changed description. You cannot update the name of a resource group.

  update-group-request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroup update-group-request))))

(defn create-group
  "Creates a group with a specified name, description, and resource query.

  create-group-request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.CreateGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.CreateGroupResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest create-group-request]
    (-> this (.createGroup create-group-request))))

(defn list-group-resources
  "Returns a list of ARNs of resources that are members of a specified resource group.

  list-group-resources-request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`

  returns: Result of the ListGroupResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult`

  throws: com.amazonaws.services.resourcegroups.model.UnauthorizedException - The request has not been applied because it lacks valid authentication credentials for the target resource."
  (^com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest list-group-resources-request]
    (-> this (.listGroupResources list-group-resources-request))))

(defn tag
  "Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
   are not specified in the request parameters.

  tag-request - `com.amazonaws.services.resourcegroups.model.TagRequest`

  returns: Result of the Tag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.TagResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.TagResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.TagRequest tag-request]
    (-> this (.tag tag-request))))

(defn update-group-query
  "Updates the resource query of a group.

  update-group-query-request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`

  returns: Result of the UpdateGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest update-group-query-request]
    (-> this (.updateGroupQuery update-group-query-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSResourceGroups this]
    (-> this (.shutdown))))

(defn untag
  "Deletes specified tags from a specified resource.

  untag-request - `com.amazonaws.services.resourcegroups.model.UntagRequest`

  returns: Result of the Untag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UntagResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UntagResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UntagRequest untag-request]
    (-> this (.untag untag-request))))

(defn search-resources
  "Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
   resource query in a CreateGroup or UpdateGroupQuery operation.

  search-resources-request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`

  returns: Result of the SearchResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.SearchResourcesResult`

  throws: com.amazonaws.services.resourcegroups.model.UnauthorizedException - The request has not been applied because it lacks valid authentication credentials for the target resource."
  (^com.amazonaws.services.resourcegroups.model.SearchResourcesResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest search-resources-request]
    (-> this (.searchResources search-resources-request))))

(defn get-tags
  "Returns a list of tags that are associated with a resource group, specified by an ARN.

  get-tags-request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetTagsResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetTagsResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest get-tags-request]
    (-> this (.getTags get-tags-request))))

(defn list-groups
  "Returns a list of existing resource groups in your account.

  list-groups-request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupsResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.ListGroupsResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroups list-groups-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSResourceGroups this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-group
  "Returns information about a specified resource group.

  get-group-request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetGroupResult [^AWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest get-group-request]
    (-> this (.getGroup get-group-request))))

