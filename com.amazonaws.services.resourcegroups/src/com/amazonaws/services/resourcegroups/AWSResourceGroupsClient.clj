(ns com.amazonaws.services.resourcegroups.AWSResourceGroupsClient
  "Client for accessing Resource Groups. All service calls made using this client are blocking, and will not return
  until the service call completes.

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
  (:import [com.amazonaws.services.resourcegroups AWSResourceGroupsClient]))

(defn *builder
  "returns: `com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder`"
  (^com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder []
    (AWSResourceGroupsClient/builder )))

(defn get-group-query
  "Returns the resource query associated with the specified resource group.

  request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`

  returns: Result of the GetGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupQueryResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetGroupQueryResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request]
    (-> this (.getGroupQuery request))))

(defn delete-group
  "Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
   group; it only deletes the group structure.

  request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.DeleteGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.DeleteGroupResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Updates an existing group with a new or changed description. You cannot update the name of a resource group.

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn create-group
  "Creates a group with a specified name, description, and resource query.

  request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.CreateGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.CreateGroupResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn list-group-resources
  "Returns a list of ARNs of resources that are members of a specified resource group.

  request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`

  returns: Result of the ListGroupResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult`

  throws: com.amazonaws.services.resourcegroups.model.UnauthorizedException - The request has not been applied because it lacks valid authentication credentials for the target resource."
  (^com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request]
    (-> this (.listGroupResources request))))

(defn tag
  "Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
   are not specified in the request parameters.

  request - `com.amazonaws.services.resourcegroups.model.TagRequest`

  returns: Result of the Tag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.TagResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.TagResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.TagRequest request]
    (-> this (.tag request))))

(defn update-group-query
  "Updates the resource query of a group.

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`

  returns: Result of the UpdateGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request]
    (-> this (.updateGroupQuery request))))

(defn untag
  "Deletes specified tags from a specified resource.

  request - `com.amazonaws.services.resourcegroups.model.UntagRequest`

  returns: Result of the Untag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UntagResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.UntagResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.UntagRequest request]
    (-> this (.untag request))))

(defn search-resources
  "Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
   resource query in a CreateGroup or UpdateGroupQuery operation.

  request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`

  returns: Result of the SearchResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.SearchResourcesResult`

  throws: com.amazonaws.services.resourcegroups.model.UnauthorizedException - The request has not been applied because it lacks valid authentication credentials for the target resource."
  (^com.amazonaws.services.resourcegroups.model.SearchResourcesResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request]
    (-> this (.searchResources request))))

(defn get-tags
  "Returns a list of tags that are associated with a resource group, specified by an ARN.

  request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetTagsResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetTagsResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn list-groups
  "Returns a list of existing resource groups in your account.

  request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupsResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.ListGroupsResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSResourceGroupsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-group
  "Returns information about a specified resource group.

  request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupResult`

  throws: com.amazonaws.services.resourcegroups.model.BadRequestException - The request does not comply with validation rules that are defined for the request parameters."
  (^com.amazonaws.services.resourcegroups.model.GetGroupResult [^AWSResourceGroupsClient this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request]
    (-> this (.getGroup request))))

