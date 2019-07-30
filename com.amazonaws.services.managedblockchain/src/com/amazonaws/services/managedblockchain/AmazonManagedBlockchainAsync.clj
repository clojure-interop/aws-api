(ns com.amazonaws.services.managedblockchain.AmazonManagedBlockchainAsync
  "Interface for accessing ManagedBlockchain asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonManagedBlockchainAsync instead.




  Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open source
  frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
  transactions and share data without the need for a trusted, central authority. Currently, Managed Blockchain supports
  the Hyperledger Fabric open source framework."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.managedblockchain AmazonManagedBlockchainAsync]))

(defn vote-on-proposal-async
  "Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by
   VoterMemberId, must be in the same AWS account as the principal that calls the action.

  vote-on-proposal-request - `com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VoteOnProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.VoteOnProposalResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest vote-on-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.voteOnProposalAsync vote-on-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest vote-on-proposal-request]
    (-> this (.voteOnProposalAsync vote-on-proposal-request))))

(defn list-invitations-async
  "Returns a listing of all invitations made on the specified network.

  list-invitations-request - `com.amazonaws.services.managedblockchain.model.ListInvitationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest list-invitations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync list-invitations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest list-invitations-request]
    (-> this (.listInvitationsAsync list-invitations-request))))

(defn list-proposal-votes-async
  "Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier
   of the member that cast the vote.

  list-proposal-votes-request - `com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProposalVotes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListProposalVotesResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest list-proposal-votes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProposalVotesAsync list-proposal-votes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest list-proposal-votes-request]
    (-> this (.listProposalVotesAsync list-proposal-votes-request))))

(defn get-member-async
  "Returns detailed information about a member.

  get-member-request - `com.amazonaws.services.managedblockchain.model.GetMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetMemberResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest get-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMemberAsync get-member-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest get-member-request]
    (-> this (.getMemberAsync get-member-request))))

(defn list-nodes-async
  "Returns information about the nodes within a network.

  list-nodes-request - `com.amazonaws.services.managedblockchain.model.ListNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListNodesResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest list-nodes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNodesAsync list-nodes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest list-nodes-request]
    (-> this (.listNodesAsync list-nodes-request))))

(defn create-node-async
  "Creates a peer node in a member.

  create-node-request - `com.amazonaws.services.managedblockchain.model.CreateNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateNodeResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest create-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNodeAsync create-node-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest create-node-request]
    (-> this (.createNodeAsync create-node-request))))

(defn list-members-async
  "Returns a listing of the members in a network and properties of their configurations.

  list-members-request - `com.amazonaws.services.managedblockchain.model.ListMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest list-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync list-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest list-members-request]
    (-> this (.listMembersAsync list-members-request))))

(defn get-node-async
  "Returns detailed information about a peer node.

  get-node-request - `com.amazonaws.services.managedblockchain.model.GetNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetNodeResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest get-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNodeAsync get-node-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest get-node-request]
    (-> this (.getNodeAsync get-node-request))))

(defn delete-member-async
  "Deletes a member. Deleting a member removes the member and all associated resources from the network.
   DeleteMember can only be called for a specified MemberId if the principal performing
   the action is associated with the AWS account that owns the member. In all other cases, the
   DeleteMember action is carried out as the result of an approved proposal to remove a member. If
   MemberId is the last member in a network specified by the last AWS account, the network is deleted
   also.

  delete-member-request - `com.amazonaws.services.managedblockchain.model.DeleteMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.DeleteMemberResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest delete-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMemberAsync delete-member-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest delete-member-request]
    (-> this (.deleteMemberAsync delete-member-request))))

(defn get-proposal-async
  "Returns detailed information about a proposal.

  get-proposal-request - `com.amazonaws.services.managedblockchain.model.GetProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetProposalResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest get-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProposalAsync get-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest get-proposal-request]
    (-> this (.getProposalAsync get-proposal-request))))

(defn delete-node-async
  "Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be
   recovered.

  delete-node-request - `com.amazonaws.services.managedblockchain.model.DeleteNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.DeleteNodeResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest delete-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNodeAsync delete-node-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest delete-node-request]
    (-> this (.deleteNodeAsync delete-node-request))))

(defn list-networks-async
  "Returns information about the networks in which the current AWS account has members.

  list-networks-request - `com.amazonaws.services.managedblockchain.model.ListNetworksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNetworks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListNetworksResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest list-networks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNetworksAsync list-networks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest list-networks-request]
    (-> this (.listNetworksAsync list-networks-request))))

(defn list-proposals-async
  "Returns a listing of proposals for the network.

  list-proposals-request - `com.amazonaws.services.managedblockchain.model.ListProposalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProposals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListProposalsResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest list-proposals-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProposalsAsync list-proposals-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest list-proposals-request]
    (-> this (.listProposalsAsync list-proposals-request))))

(defn get-network-async
  "Returns detailed information about a network.

  get-network-request - `com.amazonaws.services.managedblockchain.model.GetNetworkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetwork operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest get-network-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkAsync get-network-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest get-network-request]
    (-> this (.getNetworkAsync get-network-request))))

(defn create-member-async
  "Creates a member within a Managed Blockchain network.

  create-member-request - `com.amazonaws.services.managedblockchain.model.CreateMemberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateMemberResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest create-member-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMemberAsync create-member-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest create-member-request]
    (-> this (.createMemberAsync create-member-request))))

(defn create-network-async
  "Creates a new blockchain network using Amazon Managed Blockchain.

  create-network-request - `com.amazonaws.services.managedblockchain.model.CreateNetworkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetwork operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest create-network-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAsync create-network-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest create-network-request]
    (-> this (.createNetworkAsync create-network-request))))

(defn reject-invitation-async
  "Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
   received an invitation to create a member and join a network.

  reject-invitation-request - `com.amazonaws.services.managedblockchain.model.RejectInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.RejectInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest reject-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectInvitationAsync reject-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest reject-invitation-request]
    (-> this (.rejectInvitationAsync reject-invitation-request))))

(defn create-proposal-async
  "Creates a proposal for a change to the network that other members of the network can vote on, for example, a
   proposal to add a new member to the network. Any member can create a proposal.

  create-proposal-request - `com.amazonaws.services.managedblockchain.model.CreateProposalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateProposalResult>`"
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest create-proposal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProposalAsync create-proposal-request async-handler)))
  (^java.util.concurrent.Future [^AmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest create-proposal-request]
    (-> this (.createProposalAsync create-proposal-request))))

