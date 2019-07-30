(ns com.amazonaws.services.resourcegroups.AWSResourceGroupsAsync
  "Interface for accessing Resource Groups asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSResourceGroupsAsync instead.


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
  (:import [com.amazonaws.services.resourcegroups AWSResourceGroupsAsync]))

(defn create-group-async
  "Creates a group with a specified name, description, and resource query.

  create-group-request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn list-group-resources-async
  "Returns a list of ARNs of resources that are members of a specified resource group.

  list-group-resources-request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest list-group-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupResourcesAsync list-group-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest list-group-resources-request]
    (-> this (.listGroupResourcesAsync list-group-resources-request))))

(defn search-resources-async
  "Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
   resource query in a CreateGroup or UpdateGroupQuery operation.

  search-resources-request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.SearchResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest search-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchResourcesAsync search-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest search-resources-request]
    (-> this (.searchResourcesAsync search-resources-request))))

(defn get-group-query-async
  "Returns the resource query associated with the specified resource group.

  get-group-query-request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupQueryResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest get-group-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupQueryAsync get-group-query-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest get-group-query-request]
    (-> this (.getGroupQueryAsync get-group-query-request))))

(defn update-group-async
  "Updates an existing group with a new or changed description. You cannot update the name of a resource group.

  update-group-request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn get-group-async
  "Returns information about a specified resource group.

  get-group-request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest get-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync get-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest get-group-request]
    (-> this (.getGroupAsync get-group-request))))

(defn list-groups-async
  "Returns a list of existing resource groups in your account.

  list-groups-request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request))))

(defn delete-group-async
  "Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
   group; it only deletes the group structure.

  delete-group-request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn tag-async
  "Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
   are not specified in the request parameters.

  tag-request - `com.amazonaws.services.resourcegroups.model.TagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Tag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.TagResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.TagRequest tag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagAsync tag-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.TagRequest tag-request]
    (-> this (.tagAsync tag-request))))

(defn update-group-query-async
  "Updates the resource query of a group.

  update-group-query-request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest update-group-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupQueryAsync update-group-query-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest update-group-query-request]
    (-> this (.updateGroupQueryAsync update-group-query-request))))

(defn untag-async
  "Deletes specified tags from a specified resource.

  untag-request - `com.amazonaws.services.resourcegroups.model.UntagRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Untag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UntagResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UntagRequest untag-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagAsync untag-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UntagRequest untag-request]
    (-> this (.untagAsync untag-request))))

(defn get-tags-async
  "Returns a list of tags that are associated with a resource group, specified by an ARN.

  get-tags-request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest get-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync get-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest get-tags-request]
    (-> this (.getTagsAsync get-tags-request))))

